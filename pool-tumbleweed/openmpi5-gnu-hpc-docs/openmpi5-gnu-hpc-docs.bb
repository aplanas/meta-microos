SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-docs provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-docs-5.0.0-2.4.noarch.rpm"
RPM_HASH = "81a71357038bc26bc8c161212b220e60575dc426254f007d84755fd992c9094cf1581a7aecdc1b9351887f32ec252976ba8fd7c53a343f2a352bea44adfdcc3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-docs"

inherit rpm
