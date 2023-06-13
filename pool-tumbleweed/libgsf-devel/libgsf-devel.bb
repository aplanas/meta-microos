SUMMARY = "Development files for libgsf, a structured file format handling library"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "libgsf-devel-1.14.50-1.5.aarch64.rpm"
RPM_HASH = "c3d1cdbbab09e7b13946d8b8b5c66b358a7a1c92d971409076e2ffbbaa637d0973b6eab1c456e9ce66b7187add5fda147264a19bbaa6f592189e6bf45877c4c8"

RPROVIDES:${PN} += "libgsf-devel \
libgsf-devel(aarch-64) \
libgsf-doc \
pkgconfig(libgsf-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsf-1-114 \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libxml-2.0) \
typelib-1_0-Gsf-1"

inherit rpm
