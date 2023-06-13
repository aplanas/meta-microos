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

RPM_NAME = "libewf-devel-20230212-2.3.aarch64.rpm"
RPM_HASH = "f67b0ab25a76523a37d5dcc7aeb63b8269ae0778ccbc5a382b0a170c3a1ace79e19e5cc794c2a554014992a34629e51e044a469d796ddd7e528804f3addbc49f"

RPROVIDES:${PN} += "libewf-devel \
libewf-devel(aarch-64) \
pkgconfig(libewf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libewf3"

inherit rpm
