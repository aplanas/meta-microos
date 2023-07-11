SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mvapich2-hpc-devel-3.5-3.4.aarch64.rpm"
RPM_HASH = "3a3641d236fa3af996f35bccb7c874378fb51fb0fded6703465f55d796e71519611a0e10042ee89752b85b46a17694af3248b88549922c1f36b46ddb9c323f93"

RPROVIDES:${PN} += "mpiP-3-5-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
mvapich2-gnu-hpc-devel"

inherit rpm
