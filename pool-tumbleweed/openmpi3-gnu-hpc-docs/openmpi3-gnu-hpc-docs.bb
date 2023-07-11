SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-docs provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-docs-3.1.6-7.3.noarch.rpm"
RPM_HASH = "1ee40765295ff5b81f34addcd368254ae8685948be9e5f6506224ac985fe699c82f2b58e254af51be88fa7173cbd386a82750d9d6384d6f5bdde5ba12df79409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-docs"

inherit rpm
