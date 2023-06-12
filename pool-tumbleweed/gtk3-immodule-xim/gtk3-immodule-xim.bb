SUMMARY = "X input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method based on the X Input Method."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-xim-3.24.38-1.1.aarch64.rpm"
RPM_HASH = "120297d5fc2a2a391e79e46e9a7c85e75ab2a51fc5fa5785e6722f85dba82a59218b86fefb1a5b8ee08551db37d369883feca7341047893df72f4bdf14124569"

RPROVIDES:${PN} += "gtk3-immodule-xim \
gtk3-immodule-xim(aarch-64) \
locale(gtk3:ja) \
locale(gtk3:ko) \
locale(gtk3:th) \
locale(gtk3:zh)"
RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
