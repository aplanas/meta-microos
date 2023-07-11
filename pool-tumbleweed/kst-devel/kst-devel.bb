SUMMARY = "Development files for kst"
DESCRIPTION = "Development libraries and headers needed to build software \
making use of kst"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.8"

RPM_NAME = "kst-devel-2.0.8-14.5.aarch64.rpm"
RPM_HASH = "011a4eff94488a5fde9296568d3244b43d7590eb64b4113e58c38902e68f9f8dc9fab13b59c1926ee6861955bbdbc3526cc39467c5171b267b290eebf5262352"

RPROVIDES:${PN} += "kst-devel"

RDEPENDS:${PN} += "cmake-Qt5Concurrent \
cmake-Qt5Core \
cmake-Qt5Network \
cmake-Qt5PrintSupport \
cmake-Qt5Widgets \
cmake-Qt5Xml \
kst"

inherit rpm
