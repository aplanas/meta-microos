SUMMARY = "Library for JIT Lua compiler"
DESCRIPTION = "Libraries to use JIT Lua compiler"
LICENSE = "MIT"

PV = "2.1.0~beta3+git.1669107176.46aa45d"

RPM_NAME = "libluajit-5_1-2-2.1.0~beta3+git.1669107176.46aa45d-2.4.aarch64.rpm"
RPM_HASH = "feaf21b8a350f846d137e4f159ac2edcecf6f1d608d26eb0ac65c59ae1b3ea5db00e6d3a73993efd0abf46125eeae4ef8448cf2abb808089be13524490f7e852"

RPROVIDES:${PN} += "libluajit-5-1-2 \
libluajit-5.1.so.2 \
luajit-5-1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
