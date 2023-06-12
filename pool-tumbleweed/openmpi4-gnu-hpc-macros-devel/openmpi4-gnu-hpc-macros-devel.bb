SUMMARY = "Dependency package for openmpi_4_1_4-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_4_1_4-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-gnu-hpc-macros-devel-4.1.4-2.2.noarch.rpm"
RPM_HASH = "07688eee3be2a1d0a3fb5dfc583a19431aac46f2e792909b6277a8fb46ba877276747f10cdad0f73589f5a91e130f8dcacb3f06b9b20fc40a7ab9e6882473c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-macros-devel"
RDEPENDS:${PN} += "openmpi_4_1_4-gnu-hpc-macros-devel"

inherit rpm
