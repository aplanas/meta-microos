SUMMARY = "X input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method based on the X Input Method."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-xim-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "ddd8b0a01b312b3feb2ce8016c20a223eb143d406f1def51040082441f90ab187e55ecceda1354cb8df2d7ef850c8326c040a1ab1f902cd77e1a9ad24434b346"

RPROVIDES:${PN} += "gtk3-immodule-xim \
locale-gtk3-ja \
locale-gtk3-ko \
locale-gtk3-th \
locale-gtk3-zh"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
