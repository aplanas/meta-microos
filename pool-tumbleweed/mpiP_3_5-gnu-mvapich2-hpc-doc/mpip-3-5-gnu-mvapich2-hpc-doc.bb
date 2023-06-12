SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mvapich2-hpc-doc-3.5-3.3.aarch64.rpm"
RPM_HASH = "f97e7450e4611606cef995a3e3cec8b65c31b7fd839fbc69eaeb99309d765aa4834ea86b57350cb0e8fa8af1a03b241df6252d11f53f901a209ed3fbcd497869"

RPROVIDES:${PN} += "mpiP_3_5-gnu-mvapich2-hpc-doc \
mpiP_3_5-gnu-mvapich2-hpc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
