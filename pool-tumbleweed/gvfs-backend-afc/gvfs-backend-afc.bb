SUMMARY = "VFS functionality for GLib -- iPod / iPhone Support"
DESCRIPTION = "This package provides a gvfs backend that supports iPod / iPhone devices."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.5"

RPM_NAME = "gvfs-backend-afc-1.50.5-1.1.aarch64.rpm"
RPM_HASH = "1aa31f827456a5f40b3f8e4bc964dde4f1b528134bd15bac3459c32211008c2cb4c9a7a9b9af338255bc0689f53ef5c8cf3b68d8de442e9e719a59238d5ce53b"

RPROVIDES:${PN} += "gvfs-backend-afc"

RDEPENDS:${PN} += "gvfs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgvfscommon.so \
libgvfsdaemon.so \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4"

inherit rpm
