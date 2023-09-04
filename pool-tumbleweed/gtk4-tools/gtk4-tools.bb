SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12.0"

RPM_NAME = "gtk4-tools-4.12.0-2.1.aarch64.rpm"
RPM_HASH = "bb7f52d2d3153675a80ac43b4863b9959e67241e9dca4e715214db61da37a999569b76917795f6fbfa72ebe83dc95706acf9f612052a1dc3461ccf9d61f3df80"

RPROVIDES:${PN} += "gtk4-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
