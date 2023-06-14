SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mvapich2-hpc-devel-3.5-3.3.aarch64.rpm"
RPM_HASH = "e26fd5ff960f9c69a14f99349524cbd0dd5b2234dab2e121c624ce4c2721087cfcf9b49f697da908193fa47c7c868d156e3c0d66b85c39715027560be58d8c20"

RPROVIDES:${PN} += "mpiP-3-5-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
mvapich2-gnu-hpc-devel"

inherit rpm
