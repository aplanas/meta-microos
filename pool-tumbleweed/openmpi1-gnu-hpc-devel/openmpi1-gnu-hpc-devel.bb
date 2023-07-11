SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-devel"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-devel provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-devel-1.10.7-7.6.noarch.rpm"
RPM_HASH = "8e66030e87c7080b98323b314c1c175505b078a876e0c8b6ec8b774bda660d23fc4a81bd68e332a3d57f2e9bdf10354666acd99409267742db662d339816a191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-devel"

inherit rpm
