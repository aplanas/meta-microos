SUMMARY = "GObject Introspection Development Files"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.76.1"

RPM_NAME = "gobject-introspection-devel-1.76.1-2.2.aarch64.rpm"
RPM_HASH = "037c9fcbb6df56652564ab40136a585321b11987a43b34deb2d288b4b946a1eb28cc7810753a6b96e47ac6a43db3c21db906616e914e4d7c53873446fd0ff0a4"

RPROVIDES:${PN} += "gobject-introspection-devel \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gobject-introspection-no-export-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gobject-introspection \
libffi-devel \
libgirepository-1-0-1 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gobject-introspection-1.0"

inherit rpm
