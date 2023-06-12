SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi1-hpc-doc-3.5-3.3.aarch64.rpm"
RPM_HASH = "1f2009c927e3615733690f32207cef8818a2bce032af8214e0fcb30a0bd439bb38310bc7b4bc5b58e430b1232479912f9b9a7c13bf1a628bcb61a1490b69c37a"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi1-hpc-doc \
mpiP_3_5-gnu-openmpi1-hpc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
