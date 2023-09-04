SUMMARY = "Development files for kbookmarks, a XBEL format bookmark manipulation framework"
DESCRIPTION = "Development files for kbookmarks, a framework for accessing and \
manipulating bookmarks using the XBEL format"
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kbookmarks-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "404aaf58d7293a8ff81f58ea73dafed6ee914753ff0c42d8a5c010daf7430a751497b8791d112c3c51ef2ed94ba81f3cad698e7937e1bfe41b30239ce6c9b0c0"

RPROVIDES:${PN} += "cmake-KF5Bookmarks \
kbookmarks-devel"

RDEPENDS:${PN} += "cmake-KF5WidgetsAddons \
cmake-Qt5Widgets \
cmake-Qt5Xml \
extra-cmake-modules \
libKF5Bookmarks5"

inherit rpm
