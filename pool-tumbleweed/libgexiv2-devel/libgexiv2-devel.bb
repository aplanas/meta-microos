SUMMARY = "A GObject-based Exiv2 wrapper -- Development Files"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "libgexiv2-devel-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "3808477b8c69b3d7b942aaa2a6780103feaae2747f781544177d92c232e7e1668e23476e597256772d4c5dc1c2dc327c1d2fe6aa32fba3f197df6983680bf09d"

RPROVIDES:${PN} += "libgexiv2-devel \
pkgconfig-gexiv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgexiv2-2 \
pkgconfig-exiv2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
