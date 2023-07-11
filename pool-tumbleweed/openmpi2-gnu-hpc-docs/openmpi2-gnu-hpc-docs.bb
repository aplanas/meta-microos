SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-docs provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-docs-2.1.6-14.4.noarch.rpm"
RPM_HASH = "0b5aac61a0a85c92f180ebede5140e005dc67058c44964fe78eb6de0f3be51d4d78d5579f5a74de080d81fc0b255e2dbfb48421d308003d6744eeeff781299bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-docs"

inherit rpm
