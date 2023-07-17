SUMMARY = "Development files for libewf, an Expert Witness Compression Format library"
DESCRIPTION = "libewf is a library for support of the Expert Witness Compression \
Format (EWF). It supports both the SMART format (EWF-S01) and the \
EnCase format (EWF-E01). libewf allows you to read and write media \
information within the EWF files. libewf allows to read files created \
by EnCase 1 to 6, linen and FTK Imager. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libewf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230212"

RPM_NAME = "libewf-devel-20230212-2.8.aarch64.rpm"
RPM_HASH = "0838dac2d9ffd084dfb3272bdd1065e4de7ee9b9bc7721208d9317991602aeca612b4711215eeb9665ec37b605f3e824d556ca517342b2f8a989f966d1bed36b"

RPROVIDES:${PN} += "libewf-devel \
pkgconfig-libewf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libewf3"

inherit rpm
