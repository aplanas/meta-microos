SUMMARY = "Tigrigna input methods for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides two input methods for Tigrigna."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-tigrigna-2.24.33-4.4.aarch64.rpm"
RPM_HASH = "67f4297740635a339629396473a95e185dd765d7d6b036ea1936dce57116dfd8f4d193ba53abab0d6cd8e230c80a2e37f5ac2f945faf1c704084b77c00b6c1a1"

RPROVIDES:${PN} += "gtk2-immodule-tigrigna \
gtk2-immodules-tigrigna \
locale-gtk2-ti"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
