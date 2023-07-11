SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-gcc-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "cda494a49cc9ce816b774744b37d89d7dfde4781e8af80ac9d1551c8ba9a046e5ad1cf7e82e190bc6fd08dbf0eb015747cdd463d7d0450a6583e0ebf0fc9fb13"

RPROVIDES:${PN} += "liblto-plugin.so \
mingw64-cross-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw64-cross-binutils \
mingw64-cross-cpp \
mingw64-filesystem \
mingw64-headers \
mingw64-runtime"

inherit rpm
