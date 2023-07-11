SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi3-hpc-devel-static-3.5-3.3.aarch64.rpm"
RPM_HASH = "b0722eb6230b7ab5beb9685e6a4c3eaf60fc37e0020041b83580e08b865cf4d5bbc110d6106a5f63dcd28e9985667d0d7172d97758e5b79243e72bbd011e006e"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi3-gnu-hpc-devel"

inherit rpm
