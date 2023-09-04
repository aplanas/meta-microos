SUMMARY = "Amharic input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Amharic."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-amharic-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "5eab6446396ecf039be44ec11d6ff12ea83d42e764ec34af075e3b253e014e1b727f91cefc3f725d898e9b85745512e4a492d6d766d71711643e7e5fedec3eb7"

RPROVIDES:${PN} += "gtk3-immodule-amharic \
locale-gtk3-am"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
