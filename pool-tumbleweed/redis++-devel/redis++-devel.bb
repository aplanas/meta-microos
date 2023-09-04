SUMMARY = "Header files and libraries for redis++"
DESCRIPTION = "The redis++-devel package contains the header files and \
libraries for redis-plus-plus."
LICENSE = "Apache-2.0"

PV = "1.3.10"

RPM_NAME = "redis++-devel-1.3.10-1.1.aarch64.rpm"
RPM_HASH = "e097413355c2842c693ea846cf7f063a238da682c105117b627e7b4a43071f8e7735d3cf321eebc643f3e98062815bd108aefbc792c519de3eb0d53a74955112"

RPROVIDES:${PN} += "cmake-redis++ \
pkgconfig-redis++ \
redis++-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libredis++1 \
pkgconfig-hiredis \
pkgconfig-hiredis-ssl"

inherit rpm
