SUMMARY = "Tigrigna input methods for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides two input methods for Tigrigna."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-tigrigna-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "1c6643db3f653a7302801f7a93a0e999e877717232fa2146ed6a23f1fecd6aa5e061782e68fa13b7a384503a1999ec99347182b74c3f9f07e7f682c6fa7befbe"

RPROVIDES:${PN} += "gtk2-immodule-tigrigna \
gtk2-immodules-tigrigna \
locale-gtk2-ti"

RDEPENDS:${PN} += "/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
