SUMMARY = "Shared library files for libpanel"
DESCRIPTION = "The libpanel1-1 package contains shared libraries libpanel."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "libpanel1-1-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "9e9d8d5bef4f9c94deb9a361c8b5d9938023af63df6de1e03ea7395d60768b2b96488fa3c01cba7431688be43924297cedc477199d2f985ed0b6406f4ac243d1"

RPROVIDES:${PN} += "libpanel \
libpanel-1.so.1()(64bit) \
libpanel1-1 \
libpanel1-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit)"

inherit rpm
