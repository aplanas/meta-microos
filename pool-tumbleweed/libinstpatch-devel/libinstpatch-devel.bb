SUMMARY = "Development package for libinstpatch"
DESCRIPTION = "This package includes the header files for libinstpatch."
LICENSE = "LGPL-2.1-only"

PV = "1.1.6"

RPM_NAME = "libinstpatch-devel-1.1.6-2.8.aarch64.rpm"
RPM_HASH = "064e30fef164f8c46e12b1c2fd91d2c8c314724090e2344bcbd195841f74f37ecbd215d72e7c3f0f48debf41b906cc8fd53c767484d920e2f5023359c07cd69c"

RPROVIDES:${PN} += "libinstpatch-devel \
pkgconfig-libinstpatch-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinstpatch-1-0-2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-sndfile"

inherit rpm
