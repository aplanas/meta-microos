SUMMARY = "Development files for Ayatana Indicator Display Objects"
DESCRIPTION = "Shared library providing extra GTK menu items for display in \
system indicators. \
 \
This package contains the development files for Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "0.9.2"

RPM_NAME = "ayatana-ido-devel-0.9.2-1.5.aarch64.rpm"
RPM_HASH = "c9701ea0cf82abd2a1844f257e3f620c7c0bac249492f089ab64c326ecd417966d09fa79969fb2f9d2fda5396fae4cd3071e774374412b95d38df6d72e7bd0f5"

RPROVIDES:${PN} += "ayatana-ido-devel \
pkgconfig-libayatana-ido3-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-ido3-0-4-0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-AyatanaIdo3-0-4"

inherit rpm
