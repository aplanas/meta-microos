SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi3-hpc-devel-static-3.5-3.2.aarch64.rpm"
RPM_HASH = "373e232de5e91cd4e46c483919dd24dbf3d00b636d6ecfba249462d67f1b55f22821e29acbc4cc74b0b6e912cfb213eebc11555d13a8aef9833b973129dd8c95"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi3-gnu-hpc-devel"

inherit rpm
