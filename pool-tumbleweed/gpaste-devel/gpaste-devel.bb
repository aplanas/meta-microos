SUMMARY = "Development files for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the development files for the library managing \
clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gpaste-devel-43.2+6-2.1.aarch64.rpm"
RPM_HASH = "6391ca52bfbc39205dd716af2d32833684b57ffba8c70739799537e9cc83c0605c78dd567ca49a9d3fa16b13122729e04c3fd342b3ace10f9297c2e441255e06"

RPROVIDES:${PN} += "gpaste-devel \
gpaste-devel(aarch-64) \
pkgconfig(gpaste-2) \
pkgconfig(gpaste-gtk-3) \
pkgconfig(gpaste-gtk-4)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgpaste-gtk-3-0 \
libgpaste-gtk4-0 \
libgpaste2-0 \
pkgconfig(gdk-3.0) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gpaste-2) \
pkgconfig(gtk+-3.0) \
pkgconfig(gtk4) \
pkgconfig(libadwaita-1) \
typelib-1_0-GPaste-2"

inherit rpm
