SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-tools-2.24.33-4.4.aarch64.rpm"
RPM_HASH = "c4c219f8d37b5fbc63eb13a64d1b844121f6693c428f1efd728b08b86469de0a8327e0ec53064b1b50f9761aeb299d43b5185925e6b16081c6d30aa5e55c460d"

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
