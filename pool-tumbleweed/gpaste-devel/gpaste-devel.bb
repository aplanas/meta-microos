SUMMARY = "Development files for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the development files for the library managing \
clipboard history."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "gpaste-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "b3d8fa207a0e9c002e4068748cfa5d963089883296f44e4eecdc7b71bcfec2d4a742e1fd769358b7fb709e75b18d9bcad630b5e54c2f81e1868cfe0b50f18462"

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
