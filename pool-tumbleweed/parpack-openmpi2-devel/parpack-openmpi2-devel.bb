SUMMARY = "Development files for parpack-openmpi2"
DESCRIPTION = "The parpack-openmpi2-devel package contains libraries and header files for \
developing applications that use parpack-openmpi2."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "parpack-openmpi2-devel-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "6c42407be23b5bd9d487fd92228e918cc4839a14f64837ae4cda5ef712e9fe927746c7088c5374a65e5898e34bb50e2d4dc1afc60ab165aadfa693015afc051d"

RPROVIDES:${PN} += "parpack-openmpi2-devel"

RDEPENDS:${PN} += "blas-devel \
gcc-fortran \
lapack-devel \
libparpack2-openmpi2 \
openmpi2-devel"

inherit rpm
