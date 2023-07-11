SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration Development Files"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "libcolord-gtk-devel-0.3.0-2.1.aarch64.rpm"
RPM_HASH = "fb04899302126b72b747d5abc90e057f79ed7468e6a2bd38365a9771a69a50fae1d3976b8bfbbaf94f212d32b21f55a708ad53fee5923105509d39461c468ba5"

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
