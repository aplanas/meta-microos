SUMMARY = "Development files for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the development files for the library managing \
clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gpaste-devel-43.2+6-2.2.aarch64.rpm"
RPM_HASH = "6cdcddfba5916bb80cac5d0074cfd7be63f47152af6685ae9261ddef2d08fc62ea6e84c30b6b24268fea25106f71a1cef4d5b1f20c2da3628ae3117f73a1a72b"

RPROVIDES:${PN} += "gpaste-devel \
pkgconfig-gpaste-2 \
pkgconfig-gpaste-gtk-3 \
pkgconfig-gpaste-gtk-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgpaste-gtk-3-0 \
libgpaste-gtk4-0 \
libgpaste2-0 \
pkgconfig-gdk-3.0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gpaste-2 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk4 \
pkgconfig-libadwaita-1 \
typelib-1-0-GPaste-2"

inherit rpm
