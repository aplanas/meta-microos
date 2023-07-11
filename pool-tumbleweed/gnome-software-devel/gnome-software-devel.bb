SUMMARY = "Development files for the GNOME software store"
DESCRIPTION = "This subpackage contains the header files for developing \
GNOME software store plugins."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-software-devel-44.3-1.1.aarch64.rpm"
RPM_HASH = "bc55bd18b933bd073168e91fd7c2a462b355562fd2e4862d95073fc60e5f3ddcaa1473410e8922f8a43a5cb0536465dc5e0ecf95d453d5ca83ff52240dc04d8d"

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
