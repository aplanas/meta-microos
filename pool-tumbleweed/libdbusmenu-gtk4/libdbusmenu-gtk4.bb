SUMMARY = "GTK+ 2 version of libdbusmenu"
DESCRIPTION = "This package contains GTK 2 dbusmenu shared library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk4-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "9c7f98196543ef07a9eacfa4ab51717ec1700fb780a7840069e12208256f2b415aafbec824d0602db94cc6ed2fcc1cdfaf6dcba60bda239f23785923f9443630"

RPROVIDES:${PN} += "libdbusmenu-gtk.so.4()(64bit) \
libdbusmenu-gtk4 \
libdbusmenu-gtk4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
gtk2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbusmenu-glib.so.4()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
