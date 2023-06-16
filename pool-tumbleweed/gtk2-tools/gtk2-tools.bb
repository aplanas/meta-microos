SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-tools-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "0e06bf70b0ff59c2e9d8a24f097db50b11d4139f88711e24304137cef5459bb48db6f52672d9bd88791ddc58ab5c9e2bb15318bb6164d4f47ad0c625dc96a7c1"

RPROVIDES:${PN} += "gtk2-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
update-alternatives"

inherit rpm
