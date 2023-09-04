SUMMARY = "Development files for libcolord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "libcolord-devel-1.4.6-4.1.aarch64.rpm"
RPM_HASH = "d9cb813b77377d54129277f094b14108fdf75fb32a06df6b82b09a3239e0e9c9d74df8b8483a7852f9643264cbd89943e98dc06580aad8904a04c6372c88f82c"

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
