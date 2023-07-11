SUMMARY = "Development files for the Adwaita library"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the development files for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.3"

RPM_NAME = "libadwaita-devel-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "d33e18cda8c663820f7471362dce7ee230e63b98a19144f1dd60e86f1a920fdeca1c5c32ada1daa75910068c3f823e0ddbb366c5b8323709979a728534123af7"

RPROVIDES:${PN} += "libadwaita-devel \
pkgconfig-libadwaita-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadwaita-1-0 \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk4 \
typelib-1-0-Adw-1"

inherit rpm
