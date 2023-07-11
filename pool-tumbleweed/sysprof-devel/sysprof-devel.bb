SUMMARY = "Development files for sysprof"
DESCRIPTION = "The sysprof-devel package contains libraries and header files for \
developing applications that use sysprof."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-devel-3.48.0-2.2.aarch64.rpm"
RPM_HASH = "2968f1f48e2494dff1ceabeacd8ca9dc1031855e8b4766ffafe3b28e83267dd94d8c153c019fec523546c4c7003f3eef71c3d2aaab2cf4457354583c37eab71b"

RPROVIDES:${PN} += "pkgconfig-sysprof-4 \
sysprof-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-polkit-gobject-1 \
sysprof"

inherit rpm
