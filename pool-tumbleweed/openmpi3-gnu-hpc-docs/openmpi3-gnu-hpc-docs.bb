SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-docs provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-docs-3.1.6-8.1.noarch.rpm"
RPM_HASH = "fab19e8cff7294deb82da71c2e18fe47f6f76c8819339ee49b0bebc91d96b1f484b158b3c2a252d6cfe80e2712c0b3bad325e2ace105104a3f350f7760a28e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-docs"

inherit rpm
