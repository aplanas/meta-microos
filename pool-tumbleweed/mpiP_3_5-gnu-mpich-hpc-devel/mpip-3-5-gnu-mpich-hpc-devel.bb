SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mpich-hpc-devel-3.5-3.4.aarch64.rpm"
RPM_HASH = "8eb503fffb03a07f6bb3f697ad66ac0b6f0441a02a5aa9933e7ddaeefae025049a720ba698c1fe8e271786706d02dc389cce8d77ba8b577c4571d061eafe9988"

RPROVIDES:${PN} += "mpiP-3-5-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
mpich-gnu-hpc-devel"

inherit rpm
