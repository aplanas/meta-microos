SUMMARY = "Dependency package for openmpi_4_1_5-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-docs provides the dependency to get binary package openmpi_4_1_5-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_4_1_5-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi4-gnu-hpc-docs-4.1.5-2.1.noarch.rpm"
RPM_HASH = "87ffc9442e5e03ce272b42f0b18bcc4316b70fd0f4a11140822196c1df925cbd5b4c1c1fa96b29498941effc24469e23cae804329550efd6fed4a83e287659be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-4-1-5-gnu-hpc-docs"

inherit rpm
