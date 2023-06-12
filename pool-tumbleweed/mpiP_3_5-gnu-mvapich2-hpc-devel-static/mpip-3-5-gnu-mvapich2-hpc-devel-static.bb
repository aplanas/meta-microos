SUMMARY = "Static version of profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mvapich2-hpc-devel-static-3.5-3.3.aarch64.rpm"
RPM_HASH = "e229565f2e1a93cef085f725e6b447e226b19f13e2ce5da306f6d0a299e1690d866551fdeb4bf16ba902d140fb3c3ff791b41dbcff5722cacb673c4b001f3223"

RPROVIDES:${PN} += "mpiP_3_5-gnu-mvapich2-hpc-devel-static \
mpiP_3_5-gnu-mvapich2-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
mvapich2-gnu-hpc-devel"

inherit rpm
