SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-cpp-bootstrap-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "df1e06a5787d37e5bf9548e142ad94ea9053b7446c6f7f5c8fe02edf08d41b3ad484d3abaad6239f4b6a2e73fa5cbe1c79b745f3cd94c5f451a2f3fb1b4ec22b"

RPROVIDES:${PN} += "mingw64-cross-cpp-bootstrap \
mingw64-cross-cpp-bootstrap(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
