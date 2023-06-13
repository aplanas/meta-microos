SUMMARY = "Development files for GOffice"
DESCRIPTION = "GOffice is a GLib/GTK+ set of document-centric objects and utilities. \
 \
This package contains files needed to develop applications using \
goffice."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.10.55"

RPM_NAME = "goffice-devel-0.10.55-1.3.aarch64.rpm"
RPM_HASH = "f7174c52644b9ca171b251cd4c78d8f99d649ea3d1102f2e184e0993b7561e6f99042eb2d185c897d22ab92e21feea1666fdec6efb743d518cc961129735bcc7"

RPROVIDES:${PN} += "goffice-devel \
goffice-devel(aarch-64) \
goffice-doc \
pkgconfig(libgoffice-0.10)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoffice-0_10-10 \
pkgconfig(cairo) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(lasem-0.4) \
pkgconfig(libgsf-1) \
pkgconfig(librsvg-2.0) \
pkgconfig(libspectre) \
pkgconfig(libxml-2.0) \
pkgconfig(libxslt) \
pkgconfig(pangocairo) \
typelib-1_0-GOffice-0_10"

inherit rpm
