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

RPM_NAME = "libewf-devel-20230212-2.7.aarch64.rpm"
RPM_HASH = "8d70ae9b5ddc9b0869cb863298ae51a76fce10c35fb3aeb6bdc54dddb593b98d22242506f60476d7f6c74ad85c9bd0d0bd38688e37a2f0a24733383cc1697615"

RPROVIDES:${PN} += "libewf-devel \
pkgconfig-libewf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libewf3"

inherit rpm
