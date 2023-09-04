SUMMARY = "Thai-Lao input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Thai-Lao."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-thai-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "52bb01322e1606861c6e30ef85860755a0b7a5f4796085267f9011e96b5a655ee36b04abef1761abfa253fa663145195dcc5fba34bfcce11ef3388e6c5f0a0a6"

RPROVIDES:${PN} += "gtk3-immodule-thai \
locale-gtk3-lo \
locale-gtk3-th"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
