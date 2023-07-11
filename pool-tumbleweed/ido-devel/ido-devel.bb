SUMMARY = "Development files for Indicator Display Objects"
DESCRIPTION = "Shared library providing extra GTK+ menu items for display in \
system indicators. \
 \
This package contains the development files for Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "13.10.0+bzr20161028"

RPM_NAME = "ido-devel-13.10.0+bzr20161028-3.17.aarch64.rpm"
RPM_HASH = "e100d3a1f6bc395fb56fe4e99df74b29d15056655f9bc873138e5d44d784a83d821c1638b808ebbfdfb8e018d9cba35e5719cd26c2a8056c7b730ede42fa0e89"

RPROVIDES:${PN} += "ido-devel \
pkgconfig-libido3-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libido3-0-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Ido3-0-1"

inherit rpm
