SUMMARY = "Broadway input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Broadway."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-broadway-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "5b40fa5e67db90a03f2852a0dc2e57a24a970f168793d5004cb463571db8411ff11ff61368c1247d43c56adaefe784215f33eec82311ca1fe850b9038c1a616c"

RPROVIDES:${PN} += "gtk3-immodule-broadway"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
