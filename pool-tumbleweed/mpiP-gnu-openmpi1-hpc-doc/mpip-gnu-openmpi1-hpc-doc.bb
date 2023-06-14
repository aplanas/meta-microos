SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi1-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi1-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-openmpi1-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi1-hpc-doc-3.5-3.3.noarch.rpm"
RPM_HASH = "1cc3f37f267ca98602c6327e49f63a1bf6e8a08857b305995a5bbac59a7ac97d69f0cbfb13e65976ffb6877680a3d2d2c11e502a2e7ada58bd83a5a3bf0c0f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi1-hpc-doc"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi1-hpc-doc"

inherit rpm
