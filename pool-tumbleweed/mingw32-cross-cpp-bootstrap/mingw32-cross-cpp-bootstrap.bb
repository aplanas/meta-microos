SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-cpp-bootstrap-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "bd0cda9f8e7cdea6ddd96c089ccf2a0ba3f4ec8e98b74a8af749c9a39c22e9e11dec98c0f07fb4bc127a36ad34a301a8a259ce8c3f5b2b698b6d2e77949429c0"

RPROVIDES:${PN} += "mingw32-cross-cpp-bootstrap \
mingw32-cross-cpp-bootstrap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm