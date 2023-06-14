SUMMARY = "Development files for libdbusmenu-gtk3-4"
DESCRIPTION = "This package contains the development files for the dbusmenu-gtk3 library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk3-devel-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "247340129667bb0672b3ba9dd21718867fe60509c528667c47b15b562d212c17891a7ac6be0bb481a2fea3707c1c9a5309cff7c46c5c54b7d1e8963e6cd25698"

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
