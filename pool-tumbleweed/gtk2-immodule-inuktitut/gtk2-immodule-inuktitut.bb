SUMMARY = "Inuktitut input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Inuktitut."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-inuktitut-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "b4fbbd864df7879a6ad6619ee365d6ddfba523b875c701fe7d28ec84b0acc53dc2efe1fe1a5d0310b185b843e13b59661d1ff4b9242594c683b0d6ab9bc0a0bb"

RPROVIDES:${PN} += "gtk2-immodule-inuktitut \
locale-gtk2-iu"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
