SUMMARY = "Development files for librsvg, a SVG render library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "librsvg-devel-2.56.1-3.1.aarch64.rpm"
RPM_HASH = "a38ebaa47d66c2fa555699fea85a02d5ad6fd3ec022712dbf3443c45ee7dbf3058b26dab051e7abf3775b52a0dbee86ae8902e3501f2d5b799bccd25cad5d659"

RPROVIDES:${PN} += "librsvg-devel \
librsvg2-devel \
pkgconfig-librsvg-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librsvg-2-2 \
pkgconfig-cairo \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Rsvg-2-0"

inherit rpm
