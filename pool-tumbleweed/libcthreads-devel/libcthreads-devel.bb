SUMMARY = "Development files for libcthreads, a C thread library"
DESCRIPTION = "A library for C thread functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcthreads."
LICENSE = "LGPL-3.0-or-later"

PV = "20220102"

RPM_NAME = "libcthreads-devel-20220102-3.2.aarch64.rpm"
RPM_HASH = "c700dbb22a4720c68237d5a0f1b34e25333dbb04643fcf11cb3bda00a9b952454563e7bcef222dcef63078a1f995eb08f44af6fa28e51a129f4efcd58054aeef"

RPROVIDES:${PN} += "libcthreads-devel \
pkgconfig-libcthreads"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcthreads1"

inherit rpm
