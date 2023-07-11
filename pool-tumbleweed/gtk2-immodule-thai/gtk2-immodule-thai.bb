SUMMARY = "Thai-Lao input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Thai-Lao."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-thai-2.24.33-4.4.aarch64.rpm"
RPM_HASH = "16bddc582910a14e33bbebdecd40934f7e7cb13913d89bf56682f4e7cf9011dc3427a3dc5d3bedd0de8bdcf3390d0ac658ffc892c96cb2ef1dca765e31089809"

RPROVIDES:${PN} += "gtk2-immodule-thai \
locale-gtk2-lo \
locale-gtk2-th"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
