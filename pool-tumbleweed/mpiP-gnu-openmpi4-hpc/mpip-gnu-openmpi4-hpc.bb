SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi4-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi4-hpc provides the dependency to get binary package mpiP_3_5-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi4-hpc-3.5-3.3.noarch.rpm"
RPM_HASH = "d3f4ab3465fbb94c6f57e6450cdf2f74733b8269868b482ea94a851dc7d0aba4b5062fbddc38249cefb439b2a56b0cc1cae7a61e9a63a27d3dd89c6307d44672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpiP-3-5-gnu-openmpi4-hpc"

inherit rpm
