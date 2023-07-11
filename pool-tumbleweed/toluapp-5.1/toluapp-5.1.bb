SUMMARY = "C/C++ with Lua Integration Tool"
DESCRIPTION = "tolua++ is an extended version of tolua, a tool to integrate C/C++ code with \
Lua. tolua++ includes new features oriented to c++ such as: \
* support for std::string as a basic type (this can be turned off by a command \
  line option) \
* support for class templates"
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "toluapp-5.1-1.0.93-10.4.aarch64.rpm"
RPM_HASH = "17154f6ff08b82abf7e6b428e10d18df88f502b3cb9b84e3f17e4e34b17683e895c1ae7004fd517e7d66a76b4cceb427d92a2586e9dc670c6280c95f6daa5fa7"

RPROVIDES:${PN} += "toluapp-5.1"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
liblua5.1.so.5 \
libm.so.6 \
libtolua++-5.1.so.1 \
update-alternatives"

inherit rpm
