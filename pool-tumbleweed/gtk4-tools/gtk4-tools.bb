SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.4"

RPM_NAME = "gtk4-tools-4.10.4-1.2.aarch64.rpm"
RPM_HASH = "8dad3c02227205049c86b90fd03ce0837e1e75f18acd1c8a7cbf567b8c7306a9601872968a766d21040043ac81c551ce44370329b53371ca478acd8542472847"

RPROVIDES:${PN} += "gtk4-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
