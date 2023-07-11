SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi2-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi2-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-openmpi2-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi2-hpc-doc-3.5-3.4.noarch.rpm"
RPM_HASH = "bef55eb4a0dae0a238b7b48f421852e618a8fce16439ae656fd75c41e203fef2ff3a63c11587e1d443b2e85d21b682db81fc17e9c6e5ecd013453de4018ded22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi2-hpc-doc"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi2-hpc-doc"

inherit rpm
