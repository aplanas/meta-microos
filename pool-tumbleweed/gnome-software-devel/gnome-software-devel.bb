SUMMARY = "Development files for the GNOME software store"
DESCRIPTION = "This subpackage contains the header files for developing \
GNOME software store plugins."
LICENSE = "GPL-2.0-or-later"

PV = "44.4"

RPM_NAME = "gnome-software-devel-44.4-1.1.aarch64.rpm"
RPM_HASH = "ead21165ce29c6bc9124c28ec1f95729454f97bf3d52477f2b6f12fe55a5dab50e1cf9d8f96736a2cda86778666eb28bf4b1c8e0aed739785fc8e76f15de6659"

RPROVIDES:${PN} += "gnome-software-devel \
pkgconfig-gnome-software"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-software \
pkgconfig-appstream \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gtk4 \
pkgconfig-json-glib-1.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-polkit-gobject-1 \
pkgconfig-sysprof-capture-4 \
pkgconfig-xmlb"

inherit rpm
