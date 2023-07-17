SUMMARY = "Development files for kbookmarks, a XBEL format bookmark manipulation framework"
DESCRIPTION = "Development files for kbookmarks, a framework for accessing and \
manipulating bookmarks using the XBEL format"
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kbookmarks-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "2f94085d1bf86b3fadd099c6b20d16196615fd5b276144bf15ff79facbf071461523b9fb93e0fafa3ce975257fe35d88493fcd1d932b5f94fb8a6f44e1ebfe81"

RPROVIDES:${PN} += "cmake-KF5Bookmarks \
kbookmarks-devel"

RDEPENDS:${PN} += "cmake-KF5WidgetsAddons \
cmake-Qt5Widgets \
cmake-Qt5Xml \
extra-cmake-modules \
libKF5Bookmarks5"

inherit rpm
