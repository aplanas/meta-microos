SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-devel provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-devel-3.1.6-7.2.noarch.rpm"
RPM_HASH = "4907aca136d1f873559d5bbee8ab1ae6ca35f313fdddc1ad47e8947f0a59df1ab937e63af2bd5fc4d8b8b5ae737840504787d72deceb94d10e9bb8ec28f6d189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi_3_1_6-gnu-hpc-devel"

inherit rpm
