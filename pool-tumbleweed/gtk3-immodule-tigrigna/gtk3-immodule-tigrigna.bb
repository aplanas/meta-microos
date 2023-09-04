SUMMARY = "Tigrigna input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides two input methods for Tigrigna."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-tigrigna-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "5ea451becd86accaa297f805519c7a8fa13a70451f4945494f68d1c52248e9f0368728564d6587d1488a9c4c151f823a2c596ba623ea0c4643d0a4ffc787aa9a"

RPROVIDES:${PN} += "gtk3-immodule-tigrigna \
gtk3-immodules-tigrigna \
locale-gtk3-ti"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
