SUMMARY = "Development headers for Boost.Test library"
DESCRIPTION = "Development headers for Boost.Test library. Boost.Test supports for \
simple program testing, full unit testing, and for program execution \
monitoring."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_test1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "ed56f6665ae742dd8639eadab6a6a2a9809dc3439df7873cbc8d329d410484cc2ab3da46d79e3c4da082af588463567fe5e10624f79d4f4f64789ec7ab40b7f7"

RPROVIDES:${PN} += "libboost-test-devel-impl \
libboost-test1-82-0-devel"

RDEPENDS:${PN} += "libboost-headers1-82-0-devel \
libboost-test1-82-0"

inherit rpm
