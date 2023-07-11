SUMMARY = "Development files for libdbusmenu-glib"
DESCRIPTION = "This package contains the development files for the dbusmenu-glib library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-glib-devel-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "3c7b06cab1b26fcf0985afd6b5ecb58429f9fe8e37ed5da0c912ada87b5139b3ecd2604dfccea9f4e1769c1d4cdd053de809d713142118a9ac62a9070599e6fa"

RPROVIDES:${PN} += "libdbusmenu-glib-devel \
pkgconfig-dbusmenu-glib-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-glib4 \
pkgconfig-dbus-glib-1 \
typelib-1-0-Dbusmenu-0-4"

inherit rpm
