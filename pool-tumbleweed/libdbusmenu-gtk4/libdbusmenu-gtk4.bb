SUMMARY = "GTK+ 2 version of libdbusmenu"
DESCRIPTION = "This package contains GTK 2 dbusmenu shared library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk4-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "5a2a42a0e9c85412f2ddd318bb60828f16d7062ed84a85e8d617f2bd254556995f18607ce52796594fbe27a4893466396cc898e9cd7a306aed8f56247a1dba8d"

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
