SUMMARY = "Shared library files for libpanel"
DESCRIPTION = "The libpanel1-1 package contains shared libraries libpanel."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "libpanel1-1-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "9e9d8d5bef4f9c94deb9a361c8b5d9938023af63df6de1e03ea7395d60768b2b96488fa3c01cba7431688be43924297cedc477199d2f985ed0b6406f4ac243d1"

RPROVIDES:${PN} += "libpanel \
libpanel-1.so.1 \
libpanel1-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1"

inherit rpm
