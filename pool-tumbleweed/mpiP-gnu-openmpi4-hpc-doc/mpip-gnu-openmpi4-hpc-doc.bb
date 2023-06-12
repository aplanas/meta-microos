SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi4-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi4-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-openmpi4-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi4-hpc-doc-3.5-3.2.noarch.rpm"
RPM_HASH = "0dc4edc9bf3e8e5c8f3b9081beb2ce4eff392dbdce5b6e8462ae07351596c7e91ab7c05041df564fd5dc8abe17f9b72387da3b720682bab756ce6ee6e2e30d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi4-hpc-doc"
RDEPENDS:${PN} += "mpiP_3_5-gnu-openmpi4-hpc-doc"

inherit rpm
