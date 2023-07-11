SUMMARY = "Development files for libdbusmenu-jsonloader4"
DESCRIPTION = "This package contains the development files for the dbusmenu-jsonloader library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-jsonloader-devel-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "1c8069964130c6514f08428fd8e3ae24b2bcb6ab20fb794b0f2a6ec583ab6e3ae40909109bd61ff95308f65289036340fc31e5680f7188ed332497491a2fd479"

RPROVIDES:${PN} += "libdbusmenu-jsonloader-devel \
pkgconfig-dbusmenu-jsonloader-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbusmenu-jsonloader4 \
pkgconfig-dbus-glib-1 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-json-glib-1.0"

inherit rpm
