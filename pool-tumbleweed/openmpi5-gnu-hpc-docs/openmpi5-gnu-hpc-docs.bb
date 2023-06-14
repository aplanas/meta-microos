SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-docs provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-docs-5.0.0-2.3.noarch.rpm"
RPM_HASH = "2a37e84c4da79f22368ae32a82f5da934b59d52f8ac59e03222699ff5c504e690d7b806543869d3cf186b82fe4d797e01afb6dbd3cc0275e948ee72a41aea0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-docs"

inherit rpm
