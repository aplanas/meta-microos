SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-docs"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-docs provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-docs-1.10.7-8.1.noarch.rpm"
RPM_HASH = "c6ebafbd7dc705cda188b8465762d0431061bf6b2e87d37baa11dde9af14131351298cd392e94167c884bf018aa22969fe0df9753cdb85734d4582323301f463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-docs"

inherit rpm
