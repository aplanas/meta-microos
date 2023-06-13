SUMMARY = "Vietnamese input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Vietnamese."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-vietnamese-3.24.38-1.1.aarch64.rpm"
RPM_HASH = "324449988624b8a6daf6ed66b79bc0f186b170e6fcf4ce9d12412d4a17127a11ca97b8626335e56a5c0665cf64934ecec0c9631a4419a138e87e5554b16588c2"

RPROVIDES:${PN} += "gtk3-immodule-vietnamese \
gtk3-immodule-vietnamese(aarch-64) \
locale(gtk3:vi)"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
