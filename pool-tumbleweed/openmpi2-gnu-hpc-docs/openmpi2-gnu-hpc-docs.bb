SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-docs provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-docs-2.1.6-14.3.noarch.rpm"
RPM_HASH = "4eceff6cb58c00577bfa891d6c24f10062bd253fa20472bf8b5df6b96648d26540074c2e613aa749d2abf5ecdc4ad107790019400e01774a86f95b1b781f3ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi_2_1_6-gnu-hpc-docs"

inherit rpm
