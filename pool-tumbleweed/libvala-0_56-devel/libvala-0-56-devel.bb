SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Development files for the Vala runtime library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.13"

RPM_NAME = "libvala-0_56-devel-0.56.13-1.1.aarch64.rpm"
RPM_HASH = "f7fc6ae169feea6f657d7818e90427a76296bb4c998ac63fe6e976fe239de7d0ae03695cdd62f9d3697c93f05b2ea75c87fdf3ce780de4ae4e2c91c1195e7acc"

RPROVIDES:${PN} += "libvala-0-56-devel \
libvala-devel \
pkgconfig-libvala-0.56"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvala-0-56-0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
