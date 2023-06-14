SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-bootstrap-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "c0c9ec82b115e3caa83ff8008cde462f0cb225f475ea69c1318ab5c5ee9a3dad2115c720f92e62fd33c373a34bb36bd0de4262ecf01683e9cad834fe99dccbbc"

RPROVIDES:${PN} += "liblto-plugin.so \
mingw32-cross-gcc-bootstrap"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw32-cross-binutils \
mingw32-cross-cpp-bootstrap \
mingw32-filesystem \
mingw32-headers \
mingw32-headers-dummy-pthread"

inherit rpm
