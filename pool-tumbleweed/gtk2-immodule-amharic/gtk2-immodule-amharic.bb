SUMMARY = "Amharic input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Amharic."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-amharic-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "c8942b938c875a8ff6099fd3f10d798d5579157802a9dc79898e0203c47a3f53b08c21faa08f74bd5dcf88cdd934358dfa9032f0d4c0ff30e1f460a4dcef7ad6"

RPROVIDES:${PN} += "gtk2-immodule-amharic \
locale-gtk2-am"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
