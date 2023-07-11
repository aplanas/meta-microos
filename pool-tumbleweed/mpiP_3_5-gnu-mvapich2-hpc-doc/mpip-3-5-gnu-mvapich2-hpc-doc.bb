SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mvapich2-hpc-doc-3.5-3.4.aarch64.rpm"
RPM_HASH = "917452ec94a7ee994329645d6b93bd683bd7559a2a9c7eb5923c9d1c2fef2c6b8de9242eb15bda540199648f1833b3b15e6583a5d4ff0113df61a20b35f15fe7"

RPROVIDES:${PN} += "mpiP-3-5-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
