SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi3-hpc-doc-3.5-3.3.aarch64.rpm"
RPM_HASH = "176e4e571e6bb224aa2daea95f355d09d6ab785e026a7879b24d860cd543cf006a0759aed36453ca3788b169f483a52a760e5d7928c59177cc8c3d798469719f"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi3-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
