SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi3-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi3-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-openmpi3-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi3-hpc-doc-3.5-3.3.noarch.rpm"
RPM_HASH = "23e29a81f235d5cdc3576f356d083f9fdfef295e8fb2779b4d04adda1c75b22f59820c887cb7ed685bd8cb763af3744bea59fc2e4c0bc5c6794f1ce30d125312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi3-hpc-doc"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi3-hpc-doc"

inherit rpm
