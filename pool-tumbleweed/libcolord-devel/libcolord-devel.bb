SUMMARY = "Development files for libcolord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolord-devel-1.4.6-3.1.aarch64.rpm"
RPM_HASH = "06b1100ac0e84e03b35bf526b4638c64661e48f27123c1c57083e16bcde74e25d7cd3c922b77a09241a6654e21839cc9414746e5841897f5bd0685af816dea6e"

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
