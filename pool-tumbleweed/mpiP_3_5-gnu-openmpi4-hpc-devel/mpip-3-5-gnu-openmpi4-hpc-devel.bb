SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi4-hpc-devel-3.5-3.3.aarch64.rpm"
RPM_HASH = "84435137083f4d315dfc9e72a5abc92e969108b2de89115f586d3fcd76d5caeec28a82bb7c2415aac6d4b1d0f3ec74270a20e50565091e97cb0b4410ee473d5c"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi4-gnu-hpc-devel"

inherit rpm
