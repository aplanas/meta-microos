SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-macros-devel-3.1.6-8.1.noarch.rpm"
RPM_HASH = "044c9ce2b2cb1746f8a576e9fc286f421e6a126ce6a7b258f13046f3023b514930046171fa7e8bbae7d153619fac4b2350d7e60dad159fe9cb163b9e3d48345d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-macros-devel"

inherit rpm
