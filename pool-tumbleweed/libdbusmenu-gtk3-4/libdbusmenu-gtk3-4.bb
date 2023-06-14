SUMMARY = "GTK+ 3 version of libdbusmenu"
DESCRIPTION = "This package contains GTK 3 dbusmenu shared library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk3-4-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "9d5d21edd6ba8e660462c822f3f9c95fcb1409af09f76207362d812d4f7c314fe11bc8f4ed90afefe9803ce292ce582a8368e6b2ee22e1444dc18a34155dc78f"

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
