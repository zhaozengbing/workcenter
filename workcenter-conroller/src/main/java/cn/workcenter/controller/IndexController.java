package cn.workcenter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.workcenter.common.WorkcenterApplication;

@Controller
public class IndexController extends WorkcenterApplication {
	
	/**
	 * 跳到登录页
	 * 
	 * @param request
	 * @param response
	 * @return	
	 */
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public Object loginPage1(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("basePath", BASE_PATH);
		return "/hello";
	}
	
}
