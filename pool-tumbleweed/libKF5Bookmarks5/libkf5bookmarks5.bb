SUMMARY = "Framework for manipulating bookmarks in XBEL format"
DESCRIPTION = "This is a framework for accessing and manipulating bookmarks using \
the XBEL format."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Bookmarks5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "0822f4b2ed34a5371b4c74df5ac04eb108cfdc832cd29fa83c84ca512d148b0e6ca65d14406287a34cc2ed99780dde3eb5f5fc2d250ce0d9d696b7299afd3a69"

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
