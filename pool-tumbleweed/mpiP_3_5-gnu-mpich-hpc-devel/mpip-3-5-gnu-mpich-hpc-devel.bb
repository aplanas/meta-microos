SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mpich-hpc-devel-3.5-3.3.aarch64.rpm"
RPM_HASH = "a0aa16e3fbbd23c714ff72c648e7d66d1c1698002d1ebe35e8d4e4a897eeb16c64c4f74f72626ee65cfe9e4a5fbb3f2b1580aefcac14b8cd28c13a7b664a04a0"

RPROVIDES:${PN} += "mpiP-3-5-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
mpich-gnu-hpc-devel"

inherit rpm
