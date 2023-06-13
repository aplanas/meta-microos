SUMMARY = "Development files for libdbusmenu-jsonloader4"
DESCRIPTION = "This package contains the development files for the dbusmenu-jsonloader library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-jsonloader-devel-16.04.0-9.3.aarch64.rpm"
RPM_HASH = "907d9149430fde1f4c7d33f68aa3b5dbd4e13058e7836b3c8a306d8feef1b35639944262c2ae883f378e1b3147a406ab8e58a99f9535779196c5c68c67d089a7"

RPROVIDES:${PN} += "libdbusmenu-jsonloader-devel \
libdbusmenu-jsonloader-devel(aarch-64) \
pkgconfig(dbusmenu-jsonloader-0.4)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-jsonloader4 \
pkgconfig(dbus-glib-1) \
pkgconfig(dbusmenu-glib-0.4) \
pkgconfig(json-glib-1.0)"

inherit rpm
