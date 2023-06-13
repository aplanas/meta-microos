SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi3-hpc-doc-3.5-3.2.aarch64.rpm"
RPM_HASH = "a39e2e0e52a6cf850d85f9e5b5d742b9fd081924edf71349039e7905ee8d75c3025557fac00973f8c63b3ed1ae61f4b89e7aa8c4ad932045f96bda7d3315ab3e"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi3-hpc-doc \
mpiP_3_5-gnu-openmpi3-hpc-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
