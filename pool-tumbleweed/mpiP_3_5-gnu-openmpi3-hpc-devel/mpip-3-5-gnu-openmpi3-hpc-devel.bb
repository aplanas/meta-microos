SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi3-hpc-devel-3.5-3.2.aarch64.rpm"
RPM_HASH = "fa07bed319117cafee7055aa81e85bb8134a8df9d1f02b26c79eae5c0f67e550eca1bcd71afa97f608609ec50fe9313154ac2928b5a18d71803f69399454e23e"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi3-gnu-hpc-devel"

inherit rpm
