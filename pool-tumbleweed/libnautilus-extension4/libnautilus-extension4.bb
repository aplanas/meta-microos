SUMMARY = "File Manager for the GNOME Desktop -- Extension Library"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains the library used by nautilus extensions."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "libnautilus-extension4-44.2-2.1.aarch64.rpm"
RPM_HASH = "60a11491d3eaa897f4df7d46469bb6132f9467e055f94b7e40c7e2447d504497680c772844b051902d78740b1be507d659971320de7e333b90e4847e33ce7dd0"

RPROVIDES:${PN} += "libnautilus-extension.so.4 \
libnautilus-extension4 \
libnautilus-image-properties.so \
libtotem-properties-page.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgexiv2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
