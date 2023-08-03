SUMMARY = "Development files for librsvg, a SVG render library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.0-or-later"

PV = "2.56.3"

RPM_NAME = "librsvg-devel-2.56.3-1.1.aarch64.rpm"
RPM_HASH = "5d44cbc9579636cc17a8b10d47027d5e1d3b3f5e9ef7cac715f39e25c965cfb2fdb80e84be2a31952f11ea61727b297780134018febc81ee0cd839a3423f883a"

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
