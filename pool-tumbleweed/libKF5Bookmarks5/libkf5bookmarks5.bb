SUMMARY = "Framework for manipulating bookmarks in XBEL format"
DESCRIPTION = "This is a framework for accessing and manipulating bookmarks using \
the XBEL format."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Bookmarks5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "c5aad8371808b09e9afbc8a22e024126f84a971a45e2dac1d221efaf21e8f557e7163d142efc5daa4f42ce94dc5a5c1acf89c70d8c6e91ea108e09536b74f7fd"

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
