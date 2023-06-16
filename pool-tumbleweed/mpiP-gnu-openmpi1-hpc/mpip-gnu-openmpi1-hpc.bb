SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi1-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi1-hpc provides the dependency to get binary package mpiP_3_5-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi1-hpc-3.5-3.3.noarch.rpm"
RPM_HASH = "f0e84a0bfaa41313140bf77219344d45adede29f7a5848db9829ca4c25670f411aa0576959c6c1247085d4abb20567e4074203cdab6b07ff97bc1e95fb9854b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpiP-3-5-gnu-openmpi1-hpc"

inherit rpm
