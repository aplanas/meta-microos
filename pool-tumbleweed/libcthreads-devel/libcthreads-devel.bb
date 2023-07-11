SUMMARY = "Development files for libcthreads, a C thread library"
DESCRIPTION = "A library for C thread functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcthreads."
LICENSE = "LGPL-3.0-or-later"

PV = "20220102"

RPM_NAME = "libcthreads-devel-20220102-3.3.aarch64.rpm"
RPM_HASH = "3a337c233d9c75dd7cfd07440667e32ef97eeee4c2377a825d0fa41b4722ac30f7ddc763993a348b6d48daf2c2204a44be7e4d70155568834e698d6e068644a7"

RPROVIDES:${PN} += "libcthreads-devel \
pkgconfig-libcthreads"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcthreads1"

inherit rpm
