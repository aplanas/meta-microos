SUMMARY = "Development files for the Granite development library"
DESCRIPTION = "Granite is an extension of GTK+. \
 \
This package contains the development files for libgranite."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite-devel-6.2.0-1.8.aarch64.rpm"
RPM_HASH = "65720ba49de2ad44d3f4a9c6e9fe6a544f4c6a4157e30958a89ecf044cc85880c01ed1d13a302cad3f47db022da31e71549775e7df856b43d5bc4bb6696b45c1"

RPROVIDES:${PN} += "granite-devel \
pkgconfig-granite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgranite6 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
