package com.zargham.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LcsController {

	@GetMapping("/lcs")
	public String lcs() {
		return "lcs";
	}

}