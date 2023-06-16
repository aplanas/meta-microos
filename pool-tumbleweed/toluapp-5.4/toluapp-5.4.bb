SUMMARY = "C/C++ with Lua Integration Tool"
DESCRIPTION = "tolua++ is an extended version of tolua, a tool to integrate C/C++ code with \
Lua. tolua++ includes new features oriented to c++ such as: \
* support for std::string as a basic type (this can be turned off by a command \
  line option) \
* support for class templates"
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "toluapp-5.4-1.0.93-10.2.aarch64.rpm"
RPM_HASH = "c4f72c80f3967468b8c8d4e1fa30aebe76393bb3cfce717d6eb672c10ac419b4cdeda921484357a62a59cc379bda6955e5a4884ccf3fe211507ebbe1c6d911b7"

RPROVIDES:${PN} += "toluapp-5.4"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
liblua5.4.so.5 \
libm.so.6 \
libtolua++-5.4.so.1 \
update-alternatives"

inherit rpm
