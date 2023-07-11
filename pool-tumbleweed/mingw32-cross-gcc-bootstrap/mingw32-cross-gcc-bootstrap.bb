SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-bootstrap-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "bbac2bf97491595430ff1b72915dc12015bfcd0b41e4a203502ac4cc619c1f30e29f6416f5ac21e6c347fc9cfee423a2d4af9858d994523c3c7efbd3a5bcbea7"

RPROVIDES:${PN} += "liblto-plugin.so \
mingw32-cross-gcc-bootstrap"

RDEPENDS:${PN} += "/usr/bin/sh \
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
