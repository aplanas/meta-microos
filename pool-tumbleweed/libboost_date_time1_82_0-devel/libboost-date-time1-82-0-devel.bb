SUMMARY = "Development headers for Boost.DateTime library"
DESCRIPTION = "This package contains development header files and libraries for \
Boost.DateTime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_date_time1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "b5e7a8b1b859f22f194aba1dda5ea9bad29db72f49fb1f93f9b06ba1474da8ea0b8c5a059c3cbae70e2b2163e2326dfe57226479c826a2417f9c7f852ca83618"

RPROVIDES:${PN} += "libboost-date-time-devel-impl \
libboost-date-time1-82-0-devel"

RDEPENDS:${PN} += "libboost-date-time1-82-0 \
libboost-headers1-82-0-devel \
libstdc++-devel"

inherit rpm
