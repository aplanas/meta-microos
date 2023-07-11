SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-cpp-bootstrap-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "8ee1f9e6b41286a591e02ffe43e4d3ddce8ad365db4d0d95e2d02820662b6795537c87735263075347da33bdbfa674e45615090e36dbde4a4a47e7a0fef177f1"

RPROVIDES:${PN} += "mingw32-cross-cpp-bootstrap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
