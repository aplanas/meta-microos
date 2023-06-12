SUMMARY = "Broadway input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Broadway."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-broadway-3.24.38-1.1.aarch64.rpm"
RPM_HASH = "f2b3e94a79e177f88d1ba863c140ca183782a151f7990b00c3407c9b500baec70c8cfe73b5973079ff0d5dbfeda326241728cf4609bb2edd0cf725b276967593"

RPROVIDES:${PN} += "gtk3-immodule-broadway \
gtk3-immodule-broadway(aarch-64)"
RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
