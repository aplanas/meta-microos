SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi1-hpc-doc-3.5-3.4.aarch64.rpm"
RPM_HASH = "8c5d09b83a7482181da40db67a5177ce00018bc34003f05447bbe12657f8ef748a94b13525c6e61cfef33cd5cc39c00cb418990575e03a1277aa10fedd79c5eb"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi1-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
