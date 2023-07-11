SUMMARY = "Automatic archives creating and extracting library"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet. \
 \
This package brings files required to develop against gnome-autoar"
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.4"

RPM_NAME = "gnome-autoar-devel-0.4.4-1.2.aarch64.rpm"
RPM_HASH = "97bad22769b7d27e597a0a7a0d1fdda78aeeb0bc6c0412e6783bebd74decf00bf491447e475abf5f44bb3888a7f502076919b25e95a9cf77321d18997845ee7c"

RPROVIDES:${PN} += "gnome-autoar-devel \
pkgconfig-gnome-autoar-0 \
pkgconfig-gnome-autoar-gtk-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-autoar-0-0 \
libgnome-autoar-gtk-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libarchive \
typelib-1-0-GnomeAutoar-0-1 \
typelib-1-0-GnomeAutoarGtk-0-1"

inherit rpm
