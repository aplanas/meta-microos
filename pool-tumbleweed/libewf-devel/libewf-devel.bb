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

RPM_NAME = "libewf-devel-20230212-3.1.aarch64.rpm"
RPM_HASH = "d5a77eb6b329a41864634fc98f807117b39d3eff74a31b2093c49a6beebc511c7d66c6fb9d55328ca40f8947eb9af90bfd944c5dbf1277dfc12ba3a2076e9ebf"

RPROVIDES:${PN} += "libewf-devel \
pkgconfig-libewf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libewf3"

inherit rpm
