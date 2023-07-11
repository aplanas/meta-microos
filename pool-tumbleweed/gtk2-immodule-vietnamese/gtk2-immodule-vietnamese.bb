SUMMARY = "Vietnamese input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Vietnamese."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-vietnamese-2.24.33-4.4.aarch64.rpm"
RPM_HASH = "8d1647beccb911b50e50bccc27f2ea8cbf46c5894b95cb459d23c27db9c323017c9e1994636bd6574561d8ca5af31a665d82cc565637ad7fca0ca271a10a7153"

RPROVIDES:${PN} += "gtk2-immodule-vietnamese \
locale-gtk2-vi"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
