SUMMARY = "Amharic input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Amharic."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-amharic-3.24.38-1.1.aarch64.rpm"
RPM_HASH = "296e9fbd14046d8bfa29dd761cb689ae7de4b4eed7ed328020de133bf25fb483c5e9a49b2ad5fc445787c86d28e72625f7c3b6964939e5981a4f1957a22101e2"

RPROVIDES:${PN} += "gtk3-immodule-amharic \
gtk3-immodule-amharic(aarch-64) \
locale(gtk3:am)"
RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
