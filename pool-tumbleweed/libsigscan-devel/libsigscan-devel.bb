SUMMARY = "Development files for libigscan"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libpff."
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "libsigscan-devel-20230109-2.1.aarch64.rpm"
RPM_HASH = "7069263cb201f0523b8e1a02e4b9da00b0428267bb08e50958cbc5ef2c787fed2af88c419f1949324e1a37ccdef4c5af0e49c07af240fcfec23ec35882c41777"

RPROVIDES:${PN} += "libsigscan-devel \
pkgconfig-libsigscan"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libsigscan1"

inherit rpm
