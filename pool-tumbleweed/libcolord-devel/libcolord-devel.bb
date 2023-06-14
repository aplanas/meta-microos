SUMMARY = "Development files for libcolord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolord-devel-1.4.6-2.3.aarch64.rpm"
RPM_HASH = "007923c5a7ffaac5676bf9550e7fec129cd7d2f187e6ca73ee47d9885349144f2cd21b76da251652b17ca765278c677b37afd44ce7eec86472442a288ab0aa9c"

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
