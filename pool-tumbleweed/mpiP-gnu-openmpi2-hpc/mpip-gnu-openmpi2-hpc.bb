SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi2-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi2-hpc provides the dependency to get binary package mpiP_3_5-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi2-hpc-3.5-3.3.noarch.rpm"
RPM_HASH = "afcaf446aa0ff0cb7dc28a3813fd89b46f170a72e1c1e2733aaec6b32be046453a8f59f88fc148b061ae175e09e2a10fdc22a59d9d1f2b337fbb4715b765657e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpiP-3-5-gnu-openmpi2-hpc"

inherit rpm
