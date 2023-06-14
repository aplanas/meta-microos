SUMMARY = "Development files for libpanel"
DESCRIPTION = "The libpanel-devel package contains libraries and header files for \
developing applications that use libpanel."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "libpanel-devel-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "2314d8bc8cdae6067df67aa69be09320437acc093451baee78341ab036bff0575c1af08302f49b05cebbed98d42fa5015c440f4d1acd13cfb71d4786c7b66139"

RPROVIDES:${PN} += "libpanel-devel \
pkgconfig-libpanel-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpanel1-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
typelib-1-0-Panel-1"

inherit rpm
