SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi2-hpc-doc-3.5-3.4.aarch64.rpm"
RPM_HASH = "264c0bc6dbf9ae3eb75249a5f1472e9cf3e1c33106f955ee4a6ef8c2837d79606560a6eb8fcb5a34449ddecff3cfb831554823f11feb37728b2e43d1582ce1b0"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi2-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
