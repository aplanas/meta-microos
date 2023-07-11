SUMMARY = "Development files for GOffice"
DESCRIPTION = "GOffice is a GLib/GTK+ set of document-centric objects and utilities. \
 \
This package contains files needed to develop applications using \
goffice."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.10.55"

RPM_NAME = "goffice-devel-0.10.55-1.4.aarch64.rpm"
RPM_HASH = "68b097076290c811d2e57012d60e51613970ccbd2884da92304927c30ea96f0462a309a2ab006b27c5d220fcf8c5a194c3e43bb7799049022cdc548b6af83e9f"

RPROVIDES:${PN} += "goffice-devel \
goffice-doc \
pkgconfig-libgoffice-0.10"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoffice-0-10-10 \
pkgconfig-cairo \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-lasem-0.4 \
pkgconfig-libgsf-1 \
pkgconfig-librsvg-2.0 \
pkgconfig-libspectre \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-pangocairo \
typelib-1-0-GOffice-0-10"

inherit rpm
