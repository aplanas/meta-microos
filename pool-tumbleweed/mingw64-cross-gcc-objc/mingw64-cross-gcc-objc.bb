SUMMARY = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-gcc-objc-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "c0aa0d126c68db6f0b8fe6debe9217ce531c86a313952c49dfa14c3fb4650db54f9656150f810d9d2d8c64a49720ff35a8e38317f3e88f0c7da8775340cc7bb2"

RPROVIDES:${PN} += "mingw64-cross-gcc-objc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
