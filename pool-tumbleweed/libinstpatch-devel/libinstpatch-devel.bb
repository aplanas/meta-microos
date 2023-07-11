SUMMARY = "Development package for libinstpatch"
DESCRIPTION = "This package includes the header files for libinstpatch."
LICENSE = "LGPL-2.1-only"

PV = "1.1.6"

RPM_NAME = "libinstpatch-devel-1.1.6-2.9.aarch64.rpm"
RPM_HASH = "743c9b7095ca5d6dc507a7319e7471b2508cd2729341a42145ce9332a0065993f4b6059c115cc382d7e1e941d3628fb82b955fa0b6a1f7e13a0e3f586beba594"

RPROVIDES:${PN} += "libinstpatch-devel \
pkgconfig-libinstpatch-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinstpatch-1-0-2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-sndfile"

inherit rpm
