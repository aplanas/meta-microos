SUMMARY = "Inuktitut input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Inuktitut."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-inuktitut-2.24.33-4.4.aarch64.rpm"
RPM_HASH = "3792f9533f3daf5d671e79977045664e38c2971fcb4174dc47d550ef434288a4ee94904c1d1d670b7395e05ee77c0bed5a09d53c6f34eff307d4112b12825991"

RPROVIDES:${PN} += "gtk2-immodule-inuktitut \
locale-gtk2-iu"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
