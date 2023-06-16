SUMMARY = "C/C++ with Lua Integration Tool"
DESCRIPTION = "tolua++ is an extended version of tolua, a tool to integrate C/C++ code with \
Lua. tolua++ includes new features oriented to c++ such as: \
* support for std::string as a basic type (this can be turned off by a command \
  line option) \
* support for class templates"
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "toluapp-5.1-1.0.93-10.3.aarch64.rpm"
RPM_HASH = "69415903b555d1d0ed3b816c7d99340c37d8e3a8b36b21b02f2aceb65d06aec6aaf8ac5e7d503ec0ad4902fec23319f78debc724df1b9cea34d7c869ccbc19c0"

RPROVIDES:${PN} += "toluapp-5.1"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
liblua5.1.so.5 \
libm.so.6 \
libtolua++-5.1.so.1 \
update-alternatives"

inherit rpm
