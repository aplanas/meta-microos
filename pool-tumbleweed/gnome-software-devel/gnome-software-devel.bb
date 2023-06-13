SUMMARY = "Development files for the GNOME software store"
DESCRIPTION = "This subpackage contains the header files for developing \
GNOME software store plugins."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-software-devel-44.2-1.1.aarch64.rpm"
RPM_HASH = "700c7989dec61730a2301c17c38073d36f3966d3c26a84e6bbfdd2aae05abf4d6220ba0492c996d6cdd352dcaf0628606a5d993c4346405648a8d45249d1244c"

RPROVIDES:${PN} += "gnome-software-devel \
gnome-software-devel(aarch-64) \
pkgconfig(gnome-software)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-software \
pkgconfig(appstream) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gtk4) \
pkgconfig(json-glib-1.0) \
pkgconfig(libsoup-3.0) \
pkgconfig(polkit-gobject-1) \
pkgconfig(sysprof-capture-4) \
pkgconfig(xmlb)"

inherit rpm
