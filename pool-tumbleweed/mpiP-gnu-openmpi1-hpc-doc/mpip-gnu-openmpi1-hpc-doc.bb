SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi1-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi1-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-openmpi1-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi1-hpc-doc-3.5-3.4.noarch.rpm"
RPM_HASH = "eeb7825af14c8755b549d02d5acf8eb29b70c84a54262f7537c629482c9cb91d223a051c850e79ab0d7f102b9861ff700c98a50f8cf9e377ffcaf15f7b605387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi1-hpc-doc"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi1-hpc-doc"

inherit rpm
