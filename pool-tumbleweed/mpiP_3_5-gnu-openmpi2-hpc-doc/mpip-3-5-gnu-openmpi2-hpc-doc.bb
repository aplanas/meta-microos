SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi2-hpc-doc-3.5-3.3.aarch64.rpm"
RPM_HASH = "15615dfdca6f42a669e9761b5fa45c268fb07ddc06c4819be610ad673ebfab3d2f6bed70ececdf06aec3a127a8ab468332f01ddaeeb5311449a04d7b2c05a7a9"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi2-hpc-doc \
mpiP_3_5-gnu-openmpi2-hpc-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
