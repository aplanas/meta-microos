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
libdbusmenu-qt5-2(aarch-64) \
libdbusmenu-qt5.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
