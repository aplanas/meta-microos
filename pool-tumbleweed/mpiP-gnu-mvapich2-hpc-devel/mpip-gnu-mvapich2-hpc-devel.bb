SUMMARY = "Dependency package for mpiP_3_5-gnu-mvapich2-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mvapich2-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mvapich2-hpc-devel-3.5-3.3.noarch.rpm"
RPM_HASH = "93067bbeb7ebd029d7119f1a38a0680f4a23024e4d5d519c355e588aacbfe5e428dbde7de005f162c8b7315fb5c342c98f9dc137a07e12618bafcc9fc4c8ef72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "mpiP-3-5-gnu-mvapich2-hpc-devel"

inherit rpm
