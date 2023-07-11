SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-macros-devel-3.1.6-7.3.noarch.rpm"
RPM_HASH = "3c814173d1aa4a18ee67cbe93ac71e49fb63e87409f9730ad4c2b814cca9e3917574cdb3f4ae0579d11f890d2d2746302cff2087c83b35df113df415bd6692a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-macros-devel"

inherit rpm
