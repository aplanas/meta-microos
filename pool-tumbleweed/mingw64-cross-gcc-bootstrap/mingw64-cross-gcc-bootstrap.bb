SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-gcc-bootstrap-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "d7e58bcbdc275c8b25384cb20edde31930c702151b63a1325786fdf40a56d44ca4920ca92a1cce3dbf7268e4aefb1f75a2f6c966d17ce437331c94f851c18c2e"

RPROVIDES:${PN} += "liblto-plugin.so \
mingw64-cross-gcc-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
mingw64-cross-binutils \
mingw64-cross-cpp-bootstrap \
mingw64-filesystem \
mingw64-headers \
mingw64-headers-dummy-pthread"

inherit rpm
