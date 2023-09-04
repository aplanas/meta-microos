SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-macros-devel"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-macros-devel provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-macros-devel-1.10.7-8.1.noarch.rpm"
RPM_HASH = "b5eb2df8cbd86c34087180314660ba60631e75a2dd9ac06b8b9914d5009e1e3a235071c8f5d5670cd2caf77223a164f726163d525582026a6b9e1ea9a91479d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-macros-devel"

inherit rpm
