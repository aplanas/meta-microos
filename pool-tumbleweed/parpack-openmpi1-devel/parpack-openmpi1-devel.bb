SUMMARY = "Development files for parpack-openmpi1"
DESCRIPTION = "The parpack-openmpi1-devel package contains libraries and header files for \
developing applications that use parpack-openmpi1."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "parpack-openmpi1-devel-3.9.0-1.3.aarch64.rpm"
RPM_HASH = "c04cb6e3e0071205e19a28c36c320fb8141db4de520a1082bebd1594ee237d34272eff3efcd2b2be07235ced51a9a92f907f3082bd8c502d909c9be027936f8c"

RPROVIDES:${PN} += "parpack-openmpi-devel \
parpack-openmpi1-devel \
parpack-openmpi1-devel(aarch-64)"
RDEPENDS:${PN} += "blas-devel \
gcc-fortran \
lapack-devel \
libparpack2-openmpi1 \
openmpi1-devel"

inherit rpm
