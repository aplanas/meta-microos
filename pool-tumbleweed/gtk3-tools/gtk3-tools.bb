SUMMARY = "Auxiliary utilities for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-tools-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "5d92c78664f262ce6c31f0314ac49a90832de5a7b54d2740fbaeed0dff4db0395fd314d22dce875c3acd18e07d6b25903a0fa8e41a3dad9924f281f61586d84b"

RPROVIDES:${PN} += "gtk3-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
update-alternatives"

inherit rpm
