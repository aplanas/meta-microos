SUMMARY = "Framework for manipulating bookmarks in XBEL format"
DESCRIPTION = "This is a framework for accessing and manipulating bookmarks using \
the XBEL format."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Bookmarks5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2267296f43e99be951555ecede165f8754b5067e9ecae3e43ff5831cc57f586a8898d4fed5f53936700d595ad88e761d4984e1d2c724eb37ab765a9aeb5cd961"

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
