SUMMARY = "C/C++ with Lua Integration Tool"
DESCRIPTION = "tolua++ is an extended version of tolua, a tool to integrate C/C++ code with \
Lua. tolua++ includes new features oriented to c++ such as: \
* support for std::string as a basic type (this can be turned off by a command \
  line option) \
* support for class templates"
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "toluapp-5.3-1.0.93-10.2.aarch64.rpm"
RPM_HASH = "4c28b50ef3fbdbd71e5bbd5f4229df934c37e66daaf0b1400b7b6518a7a82805f715ca2632ac9e4a4ee1b768c0d3952dd3445d455211b38dbc26e0e2384154a0"

RPROVIDES:${PN} += "toluapp-5.3 \
toluapp-5.3(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
liblua5.3.so.5()(64bit) \
libm.so.6()(64bit) \
libtolua++-5.3.so.1()(64bit) \
update-alternatives"

inherit rpm
