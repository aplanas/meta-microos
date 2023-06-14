SUMMARY = "Development files for librsvg, a SVG render library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.1"

RPM_NAME = "librsvg-devel-2.56.1-1.1.aarch64.rpm"
RPM_HASH = "88e1c63488a8c3640f409949c8a238e7d912d62c12180cbe88339866681f52c1b6aedb504b4bea5d1b1f201b78f4689dc3f576a9f0dd7ead209034a559d65b5d"

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
