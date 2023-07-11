SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-devel provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-devel-3.1.6-7.3.noarch.rpm"
RPM_HASH = "bfb23d1adb1b5679915552ec3f2d42f71d4d3d95cdbed97b0d3ab2eee3d8de2addc06d5c6dbcf5bd2efafca91caeef7c0ae3fac84918dc6691fbf8b415b4915e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-devel"

inherit rpm
