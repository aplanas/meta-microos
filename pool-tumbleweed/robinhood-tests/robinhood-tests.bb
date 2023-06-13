SUMMARY = "Internal tests for robinhood"
DESCRIPTION = "Tests and examples for the robinhood policy engine."
LICENSE = "CECILL-C"

PV = "3.1.7"

RPM_NAME = "robinhood-tests-3.1.7-2.1.aarch64.rpm"
RPM_HASH = "d60cfced18ea547d3927247cfe3838dce038d2f29e6a490aa389e0e4f4bec221af5aeda0dc08b9e7fd43ff0fa4d1f1fe236327041d36a09b96b78eb190914dd4"

RPROVIDES:${PN} += "robinhood-tests \
robinhood-tests(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
