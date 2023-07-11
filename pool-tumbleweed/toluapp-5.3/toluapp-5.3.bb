SUMMARY = "C/C++ with Lua Integration Tool"
DESCRIPTION = "tolua++ is an extended version of tolua, a tool to integrate C/C++ code with \
Lua. tolua++ includes new features oriented to c++ such as: \
* support for std::string as a basic type (this can be turned off by a command \
  line option) \
* support for class templates"
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "toluapp-5.3-1.0.93-10.3.aarch64.rpm"
RPM_HASH = "444e095d63178796ee77815f5c4d3110985aa5fd68d85e1335116eed85ff67179c45a8b8b2a21b12be68e9086d82d0a7ae6712c7a4014a8ecd435ca096350ba1"

RPROVIDES:${PN} += "toluapp-5.3"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
liblua5.3.so.5 \
libm.so.6 \
libtolua++-5.3.so.1 \
update-alternatives"

inherit rpm
