SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration Development Files"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "libcolord-gtk-devel-0.3.0-1.4.aarch64.rpm"
RPM_HASH = "346fc2321be99842f1d9f2e848bb8c4e4d9670b88ed8be1bbabc5a1f3dca9529b290a5418198ffd54d8b304a3da91f320ad4d5546b27014a939d9b0cc5d6cc1e"

RPROVIDES:${PN} += "libcolord-gtk-devel \
pkgconfig-colord-gtk \
pkgconfig-colord-gtk4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcolord-gtk1 \
libcolord-gtk4-1 \
pkgconfig-colord \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk4 \
typelib-1-0-ColordGtk-1-0"

inherit rpm
