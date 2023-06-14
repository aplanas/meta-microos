SUMMARY = "Granite is a development library"
DESCRIPTION = "Granite is an extension of GTK+. It provides the commonly used widgets \
found in Elementary applications."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "libgranite6-6.2.0-1.7.aarch64.rpm"
RPM_HASH = "02ca3413a219befd65c366909b560a0c8914f0acb39f81ebd376e54835f0885d357a18ff39cf92939a0d64fa5b14cc2bb010709c614bc74fe0f50a1ccf456662"

RPROVIDES:${PN} += "granite \
libgranite.so.6 \
libgranite6"

RDEPENDS:${PN} += "/sbin/ldconfig \
granite-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
