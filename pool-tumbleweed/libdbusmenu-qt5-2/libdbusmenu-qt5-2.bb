SUMMARY = "Development package for dbusmenu-qt5"
DESCRIPTION = "This library provides a Qt implementation of the DBusMenu protocol. \
 \
The DBusMenu protocol makes it possible for applications to export and import \
their menus over DBus. Qt5 library"
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.3+16.04.20160218"

RPM_NAME = "libdbusmenu-qt5-2-0.9.3+16.04.20160218-1.13.aarch64.rpm"
RPM_HASH = "949def40d5c8e9602913089047d8e65333d8089a88bc91f12cf0ddf5c1cc5f83f905a2c2038cee9b6c45c7dd571affca0338f601cc1b3d19048ba7e027e73caa"

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
