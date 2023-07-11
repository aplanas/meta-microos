SUMMARY = "MinGW Windows cross-compiler for C++"
DESCRIPTION = "MinGW Windows cross-compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-c++-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "cf9537ea203c45bcc7e3b6727d08b116849061f6e95a61333f72bbef41a27fe4496b3eb85d15016722d5b4270070ed4c288c2e9adb101d428033944bddd3062c"

RPROVIDES:${PN} += "mingw32-cross-gcc-c++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw32-cross-gcc"

inherit rpm
