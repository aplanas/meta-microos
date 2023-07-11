SUMMARY = "Development files for libcolord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolord-devel-1.4.6-2.4.aarch64.rpm"
RPM_HASH = "0617aa6340ec6c2c602d17d02e6d29c2a27f39c3c108c4c1a82773f3b9af72c12a3b9b4893eab60b4a84f74b89cec9476d18cfa5ebb3b9bcfa9e46429d769704"

RPROVIDES:${PN} += "libcolord-devel \
pkgconfig-colord \
pkgconfig-colorhug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
colord-color-profiles \
libcolord2 \
libcolorhug2 \
pkgconfig-colord \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gusb \
typelib-1-0-Colord-1-0 \
typelib-1-0-Colorhug-1-0"

inherit rpm
