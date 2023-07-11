SUMMARY = "Development package for dbusmenu-qt5"
DESCRIPTION = "This library provides a Qt implementation of the DBusMenu protocol. \
 \
The DBusMenu protocol makes it possible for applications to export and import \
their menus over DBus. Qt5 library"
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.3+16.04.20160218"

RPM_NAME = "libdbusmenu-qt5-2-0.9.3+16.04.20160218-1.14.aarch64.rpm"
RPM_HASH = "0689a1ccd5cc9f5166c5dbce0db075026555bf90a6bb269e22c7efd4cb9d9c06a345440b0f7867d8f5b3b601eba7ec04b876a60cb18443cbc39e1075e38cb247"

RPROVIDES:${PN} += "libdbusmenu-qt5-2 \
libdbusmenu-qt5.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
