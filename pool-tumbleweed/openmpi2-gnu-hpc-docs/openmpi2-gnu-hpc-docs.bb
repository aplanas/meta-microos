SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc-docs provides the dependency to get binary package openmpi_2_1_6-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-docs-2.1.6-15.1.noarch.rpm"
RPM_HASH = "b883dc2ca39f99dc16847de1df096292f72091ff65cb4a971a61da22c09cb6254900d4049640515e1c6ebcd4e820d55f061648998f0af814e4a8ca23770aa915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi2-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-docs"

inherit rpm
