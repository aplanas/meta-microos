SUMMARY = "Xfdashboard Development Files"
DESCRIPTION = "This package provides files required for development for Xfdashboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "xfdashboard-devel-1.0.0-1.5.aarch64.rpm"
RPM_HASH = "3fd95465c01be6bffffc54e77a9fba3b879d1a33b458aebe507b374de384f7f31e73fae70a0c12efd971313554b0457f194818786487209949680ad9394c7f96"

RPROVIDES:${PN} += "pkgconfig-libxfdashboard \
xfdashboard-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxfdashboard0 \
pkgconfig-clutter-1.0 \
pkgconfig-clutter-cogl-1.0 \
pkgconfig-clutter-gdk-1.0 \
pkgconfig-garcon-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libwnck-3.0 \
pkgconfig-libxfce4ui-2 \
pkgconfig-libxfce4util-1.0 \
pkgconfig-libxfconf-0"

inherit rpm
