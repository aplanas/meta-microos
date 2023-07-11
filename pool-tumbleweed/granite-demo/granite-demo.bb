SUMMARY = "Demo binaries for the Granite development library"
DESCRIPTION = "Granite is an extension of GTK+. \
 \
This package contains a small demo application to show the granite widgets."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite-demo-6.2.0-1.8.aarch64.rpm"
RPM_HASH = "9dc1741795a1a5a77a55547e1a50ea1034ab3c0c15075cbe674b99f90a1c853c18f9f29a7f9b967c2a0bce8d00d2ff53064e9f12f51a4df2c256f6d5b15e4d98"

RPROVIDES:${PN} += "granite-demo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
