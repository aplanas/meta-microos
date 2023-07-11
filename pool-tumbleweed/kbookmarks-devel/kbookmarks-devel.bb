SUMMARY = "Development files for kbookmarks, a XBEL format bookmark manipulation framework"
DESCRIPTION = "Development files for kbookmarks, a framework for accessing and \
manipulating bookmarks using the XBEL format"
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kbookmarks-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "7b78569dd790732751598f2f30bd1c7361b75f3483637a6b71669b546f362a53f867eb413dc3241b384c2e8e552b6dc96749ab0905af5184b2de028e5ee21748"

RPROVIDES:${PN} += "cmake-KF5Bookmarks \
kbookmarks-devel"

RDEPENDS:${PN} += "cmake-KF5WidgetsAddons \
cmake-Qt5Widgets \
cmake-Qt5Xml \
extra-cmake-modules \
libKF5Bookmarks5"

inherit rpm
