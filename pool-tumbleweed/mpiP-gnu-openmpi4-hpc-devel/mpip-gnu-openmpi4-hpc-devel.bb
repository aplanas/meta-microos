SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi4-hpc-devel"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi4-hpc-devel provides the dependency to get binary package mpiP_3_5-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi4-hpc-devel-3.5-3.3.noarch.rpm"
RPM_HASH = "73625ca9390818ca625eea381f2225572c715852688f2ca86117bd520c9664c35bbe0c729b4423860128ea855980fe1ca9c46e2389e31a2cfa1dbcb240115f1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "mpiP-3-5-gnu-openmpi4-hpc-devel"

inherit rpm
