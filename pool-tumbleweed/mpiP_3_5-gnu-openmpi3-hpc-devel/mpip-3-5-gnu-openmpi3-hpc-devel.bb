SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi3-hpc-devel-3.5-3.3.aarch64.rpm"
RPM_HASH = "5db507cba9b468545ab658e1e2890568bd16cff6bb2116eaba708f1e3b37986f84eb04e52db731757f84369308d0e3369312af530fd0a92e0f22cbd221211942"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi3-gnu-hpc-devel"

inherit rpm
