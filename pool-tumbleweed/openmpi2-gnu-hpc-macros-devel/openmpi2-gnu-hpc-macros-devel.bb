SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-macros-devel-2.1.6-14.4.noarch.rpm"
RPM_HASH = "5a59e527f416a4c8c0828708f2cfe8f1022a5bc475ec97253a25a05586c3c868a18eae9bdfbb4aa790bd0d7aa48098266c13d093275930ef1c1c4273f6014cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-macros-devel"

inherit rpm
