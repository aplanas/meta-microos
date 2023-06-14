SUMMARY = "GTK+ 2 version of libdbusmenu"
DESCRIPTION = "This package contains GTK 2 dbusmenu shared library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk4-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "9c7f98196543ef07a9eacfa4ab51717ec1700fb780a7840069e12208256f2b415aafbec824d0602db94cc6ed2fcc1cdfaf6dcba60bda239f23785923f9443630"

RPROVIDES:${PN} += "libdbusmenu-gtk.so.4 \
libdbusmenu-gtk4"

RDEPENDS:${PN} += "/sbin/ldconfig \
gtk2 \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
