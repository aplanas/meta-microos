SUMMARY = "Inuktitut input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Inuktitut."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-inuktitut-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "d979f94f2bb87e43584f578d9a9e5a3f22a42dce2aabb8c6bdf6cbb5539910b25db93c1a17aa2ef131dc854eb4073481fb99d6e86579798d01383ff3c25dc63f"

RPROVIDES:${PN} += "gtk3-immodule-inuktitut \
locale-gtk3-iu"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
