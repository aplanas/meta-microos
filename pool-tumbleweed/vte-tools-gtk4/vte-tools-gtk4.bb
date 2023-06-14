SUMMARY = "Tools from the VTE terminal emulator package"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides tools using VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "vte-tools-gtk4-0.72.1-2.2.aarch64.rpm"
RPM_HASH = "25e2a8bbd38c4a1289bc25e3e14412ede1358282f13669a535d65fea9857b6f104037efac7fb4c49fbe33accb0394e028f23949c66617dbf42d7dcb3dc15f614"

RPROVIDES:${PN} += "vte-tools-gtk4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libvte-2.91-gtk4.so.0"

inherit rpm
