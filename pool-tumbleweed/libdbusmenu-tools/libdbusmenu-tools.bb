SUMMARY = "Development tools for the dbusmenu libraries"
DESCRIPTION = "This packages contains the development tools for the dbusmenu libraries."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-tools-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "882c42d3b1113b22b29a43fdbca9e94114f48f6cd39589cba8d3c69cbeda2570a7e71b213fd101276bfb8dcc9d7a82f38888e8c0486acf30deecad1e8a20f812"

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
