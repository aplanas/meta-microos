SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-docs provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-docs-5.0.0-3.1.noarch.rpm"
RPM_HASH = "308ba404916530f2457c6b7cc0e8f232c669b5118ba75fdcbba9b7162cd323ed4c6604b8503b0ef328bf48a3abeaeb4a0a48b23b6b19f0c7cc253901c95ee22d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-docs"

inherit rpm
