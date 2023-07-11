SUMMARY = "Header files and libraries for redis++"
DESCRIPTION = "The redis++-devel package contains the header files and \
libraries for redis-plus-plus."
LICENSE = "Apache-2.0"

PV = "1.3.8"

RPM_NAME = "redis++-devel-1.3.8-1.2.aarch64.rpm"
RPM_HASH = "b1e34925469729db69808ebee1d36184bb3539a526104361ce6402a454b0517d0881eacf910451d835ca54e5abf70524e7daee9afd3837879fe4bbfbbb0c98a8"

RPROVIDES:${PN} += "cmake-redis++ \
pkgconfig-redis++ \
redis++-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libredis++1 \
pkgconfig-hiredis \
pkgconfig-hiredis-ssl"

inherit rpm
