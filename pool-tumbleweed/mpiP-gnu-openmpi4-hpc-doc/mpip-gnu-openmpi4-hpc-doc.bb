SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi4-hpc-doc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi4-hpc-doc provides the dependency to get binary package mpiP_3_5-gnu-openmpi4-hpc-doc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi4-hpc-doc-3.5-3.3.noarch.rpm"
RPM_HASH = "c16cf243445b20b62d53831c4cac118bed159b6dd8b586e4368529f7b5c1ed36b0b50e18a3ce766a5decdff29f0d6ee5fa643cd3311a60aa4e6520855a363997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi4-hpc-doc"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi4-hpc-doc"

inherit rpm
