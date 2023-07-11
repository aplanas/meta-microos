SUMMARY = "C/C++ with Lua Integration Tool"
DESCRIPTION = "tolua++ is an extended version of tolua, a tool to integrate C/C++ code with \
Lua. tolua++ includes new features oriented to c++ such as: \
* support for std::string as a basic type (this can be turned off by a command \
  line option) \
* support for class templates"
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "toluapp-5.4-1.0.93-10.3.aarch64.rpm"
RPM_HASH = "7e9f66aa67debc4fac3579b48fda5b0f44afb71244161c3bf6ea02edcb1055059a363bcc8b24b72210e122acaf316b97f149168a694285fd24351a71c237a339"

RPROVIDES:${PN} += "toluapp-5.4"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
liblua5.4.so.5 \
libm.so.6 \
libtolua++-5.4.so.1 \
update-alternatives"

inherit rpm
