SUMMARY = "Development headers for Boost.DateTime library"
DESCRIPTION = "This package contains development header files and libraries for \
Boost.DateTime library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_date_time-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "83c8c4e49846f127d3a2d64c0c20845163135fa3dc4db3db5820f60426d74ace92f282e5406a2ae99aceaf370b7e7398490439a2c3fdb3f132b6d2fe93905e9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost-date-time-devel"

RDEPENDS:${PN} += "libboost-date-time1-82-0-devel"

inherit rpm
