SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi2-hpc-devel-3.5-3.4.aarch64.rpm"
RPM_HASH = "72360f1ebb6146f2871fd2621da84a8644e5c119ce3a116b024c1db58492ea53b16f9a660868691eed07600252fd08a9a7aef46343cbb9ba95206fdff8840f65"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi2-gnu-hpc-devel"

inherit rpm
