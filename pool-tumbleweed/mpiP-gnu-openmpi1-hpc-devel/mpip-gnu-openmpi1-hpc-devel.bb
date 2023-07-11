SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi1-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi1-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi1-hpc-devel-3.5-3.4.noarch.rpm"
RPM_HASH = "ff668f29c7d5a8dcea4425a56d5c6698a06b179d4456867f2569e95cdb32410c144885b53334b34bb4ba68e260f881b29730391b874af306c7aec59bd817d6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi1-hpc-devel"

inherit rpm
