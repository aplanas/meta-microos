SUMMARY = "MinGW Windows cross-compiler for C++"
DESCRIPTION = "MinGW Windows cross-compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-c++-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "8f988569714f3c8b47d8a8bd10ec1fa6c259c5e3c0b94498f3d958d0c1e429dda66049f64654dd37615bc47cde7163871ed94e22e16c45727245055c46493930"

RPROVIDES:${PN} += "mingw32-cross-gcc-c++ \
mingw32-cross-gcc-c++(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
mingw32-cross-gcc"

inherit rpm
