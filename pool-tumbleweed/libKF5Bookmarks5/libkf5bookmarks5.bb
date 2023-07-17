SUMMARY = "Framework for manipulating bookmarks in XBEL format"
DESCRIPTION = "This is a framework for accessing and manipulating bookmarks using \
the XBEL format."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Bookmarks5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "739fffaf65088b19e9ec3d5164f1221ee084501486aafc5b37e842e206390d28cc0efc298007b10dbfcc8ccfd5a25c4554b026057d51004fa1b5d10573b6047a"

RPROVIDES:${PN} += "libKF5Bookmarks.so.5 \
libKF5Bookmarks5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
