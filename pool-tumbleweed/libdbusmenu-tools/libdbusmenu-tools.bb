SUMMARY = "Development tools for the dbusmenu libraries"
DESCRIPTION = "This packages contains the development tools for the dbusmenu libraries."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-tools-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "935d1b90d43ec9f01c71244b00b325bec59fa375a8793e71e287547011b5744df8fb0b9261e74a3e2774ef701724259971d865d3c939245fc4e3f135424824c2"

RPROVIDES:${PN} += "libdbusmenu-tools"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libdbusmenu-glib4 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
