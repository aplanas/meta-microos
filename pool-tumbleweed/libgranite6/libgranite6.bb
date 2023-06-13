SUMMARY = "Granite is a development library"
DESCRIPTION = "Granite is an extension of GTK+. It provides the commonly used widgets \
found in Elementary applications."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "libgranite6-6.2.0-1.7.aarch64.rpm"
RPM_HASH = "02ca3413a219befd65c366909b560a0c8914f0acb39f81ebd376e54835f0885d357a18ff39cf92939a0d64fa5b14cc2bb010709c614bc74fe0f50a1ccf456662"

RPROVIDES:${PN} += "granite \
libgranite.so.6()(64bit) \
libgranite6 \
libgranite6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
granite-common \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
