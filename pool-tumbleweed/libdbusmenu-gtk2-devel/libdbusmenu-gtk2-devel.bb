SUMMARY = "Development files for libdbusmenu-gtk4"
DESCRIPTION = "This package contains the development files for the dbusmenu-gtk2 library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk2-devel-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "327fa1ecb10ca6a3de1b27a1c5db4505b89f242896dbc2b186e0869672f14f132aa5aa2e908a354db3b26f41594d9c7371d62fa45de1f48f52c798066b7e249a"

RPROVIDES:${PN} += "libdbusmenu-gtk2-devel \
libdbusmenu-gtk2-devel(aarch-64) \
pkgconfig(dbusmenu-gtk-0.4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-gtk4 \
pkgconfig(dbus-glib-1) \
pkgconfig(dbusmenu-glib-0.4) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gtk+-2.0) \
typelib-1_0-DbusmenuGtk-0_4"

inherit rpm
