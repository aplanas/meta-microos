SUMMARY = "Development files for kbookmarks, a XBEL format bookmark manipulation framework"
DESCRIPTION = "Development files for kbookmarks, a framework for accessing and \
manipulating bookmarks using the XBEL format"
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kbookmarks-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f647fa108aea0ea19a8f28f31a54dbda568adb1442cd897d8f34a8ed4b411fc910ae764e115484118fdfe5864b234c1642814c0949de755aeae47f5666657e82"

RPROVIDES:${PN} += "cmake(KF5Bookmarks) \
kbookmarks-devel \
kbookmarks-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(KF5WidgetsAddons) \
cmake(Qt5Widgets) \
cmake(Qt5Xml) \
extra-cmake-modules \
libKF5Bookmarks5"

inherit rpm
