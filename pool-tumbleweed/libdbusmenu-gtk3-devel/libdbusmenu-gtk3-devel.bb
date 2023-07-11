SUMMARY = "Development files for libdbusmenu-gtk3-4"
DESCRIPTION = "This package contains the development files for the dbusmenu-gtk3 library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk3-devel-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "00cb196e9efdfd04db1820f62c3e0f8bdadc4925529105022dbba39912c94d99d524e3f8549f92929d03d4f42853f87b96667932fdf97dbde8b077ff37adc4be"

RPROVIDES:${PN} += "libdbusmenu-gtk3-devel \
pkgconfig-dbusmenu-gtk3-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-gtk3-4 \
pkgconfig-dbus-glib-1 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-DbusmenuGtk3-0-4"

inherit rpm
