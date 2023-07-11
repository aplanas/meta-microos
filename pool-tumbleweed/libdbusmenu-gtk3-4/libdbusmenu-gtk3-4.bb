SUMMARY = "GTK+ 3 version of libdbusmenu"
DESCRIPTION = "This package contains GTK 3 dbusmenu shared library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk3-4-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "1836535912f59630ce1aa028a929cb9a984252b9804f1b16b5b4be2dbcc9ecf02009289bdb1bbf961b4bab21aea74062f8fef869e7498f7935459a88b2a84176"

RPROVIDES:${PN} += "libdbusmenu-gtk3-4 \
libdbusmenu-gtk3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
