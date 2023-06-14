SUMMARY = "Dependency package for openmpi_4_1_4-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-docs provides the dependency to get binary package openmpi_4_1_4-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-gnu-hpc-docs-4.1.4-2.2.noarch.rpm"
RPM_HASH = "1503e81bff355c14aeafafb063d888b91c670c2350a40a6ec0dc4fbf82057bf32aa4d05381d9a3cccc04f1b40d226d591e176a920ea17a825de327f958bcc494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-4-1-4-gnu-hpc-docs"

inherit rpm
