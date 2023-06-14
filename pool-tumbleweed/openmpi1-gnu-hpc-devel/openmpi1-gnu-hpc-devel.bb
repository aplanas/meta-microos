SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-devel"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-devel provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-devel-1.10.7-7.5.noarch.rpm"
RPM_HASH = "435fff7c818c28312866573cc72ed7b265dd4f1a74f2468841edf69986eecf24baad0c24ad968210de4af3c56ccde66474df66bb32203342dc9a6861fb0ec448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-devel"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-devel"

inherit rpm
