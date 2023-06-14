SUMMARY = "Automatic archives creating and extracting library"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet. \
 \
This package brings files required to develop against gnome-autoar"
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.4"

RPM_NAME = "gnome-autoar-devel-0.4.4-1.1.aarch64.rpm"
RPM_HASH = "f44850928b2b823b7743d0841ca70dc82d49e5ea76afb07afced623a7efe515f64dc10a3d21dced1945ab5ae98d0c36c24d840676ad0832fa19308ff0ff3fbfa"

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
