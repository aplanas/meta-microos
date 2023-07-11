SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "bb2379e84a7e4631f339edc71e0da3422bae7df9ef6eebc5cd098e02ea2a5a0e66cbda80fd8ff25f248ab5b25b6c630b52259d9833c33d76b0ee5e752e560e8c"

RPROVIDES:${PN} += "liblto-plugin.so \
mingw32-cross-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw32-cross-binutils \
mingw32-cross-cpp \
mingw32-filesystem \
mingw32-headers \
mingw32-runtime"

inherit rpm
