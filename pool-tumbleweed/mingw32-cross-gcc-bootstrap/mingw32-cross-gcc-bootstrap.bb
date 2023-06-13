SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-bootstrap-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "c0c9ec82b115e3caa83ff8008cde462f0cb225f475ea69c1318ab5c5ee9a3dad2115c720f92e62fd33c373a34bb36bd0de4262ecf01683e9cad834fe99dccbbc"

RPROVIDES:${PN} += "liblto_plugin.so()(64bit) \
mingw32-cross-gcc-bootstrap \
mingw32-cross-gcc-bootstrap(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
mingw32-cross-binutils \
mingw32-cross-cpp-bootstrap \
mingw32-filesystem \
mingw32-headers \
mingw32-headers-dummy-pthread"

inherit rpm
