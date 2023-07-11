SUMMARY = "Amharic input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Amharic."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-amharic-2.24.33-4.4.aarch64.rpm"
RPM_HASH = "dc51ace77767e55381139b07113a3d7b71fc6280bf8c56b42e6d66b987fd96179db2c17963d20d2ff434cbc8f506f6f36a3e0d08e2ab72a49b0638b06a178c12"

RPROVIDES:${PN} += "gtk2-immodule-amharic \
locale-gtk2-am"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
