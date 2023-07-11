SUMMARY = "Development files for libdbusmenu-gtk4"
DESCRIPTION = "This package contains the development files for the dbusmenu-gtk2 library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk2-devel-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "6c76c1fa16a6dd964cd5ebbf2b50fabfc6eee09d851b76efdb220294785db2a670ef9dee9e15cb9d95434ac468891b75504883cb30feb7354b74a6cc19871bd3"

RPROVIDES:${PN} += "libdbusmenu-gtk2-devel \
pkgconfig-dbusmenu-gtk-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-gtk4 \
pkgconfig-dbus-glib-1 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gtk+-2.0 \
typelib-1-0-DbusmenuGtk-0-4"

inherit rpm
