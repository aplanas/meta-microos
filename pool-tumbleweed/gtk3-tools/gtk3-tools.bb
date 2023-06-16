SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-tools-3.24.38-1.1.aarch64.rpm"
RPM_HASH = "0fc6f9ab7f69be8e57d12cebf66453babb724bc8e78229f93582cd0306e9632442adb5e893ec9dca96ef2dc51315d5c2d3a6b6d3d92781ec4b090e86a7b5e8f0"

RPROVIDES:${PN} += "gtk3-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
update-alternatives"

inherit rpm
