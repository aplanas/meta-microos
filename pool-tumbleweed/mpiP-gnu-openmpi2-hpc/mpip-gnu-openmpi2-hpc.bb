SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi2-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi2-hpc provides the dependency to get binary package mpiP_3_5-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi2-hpc-3.5-3.4.noarch.rpm"
RPM_HASH = "1ac6b7950d48d71d7e013ca75d44b79e10e862e8b10c89075a857e00948dfcc77913fc230aa2d63ee0e64551f0f44051c4ebf3fdca7895d0f6554bfc33564375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpiP-3-5-gnu-openmpi2-hpc"

inherit rpm
