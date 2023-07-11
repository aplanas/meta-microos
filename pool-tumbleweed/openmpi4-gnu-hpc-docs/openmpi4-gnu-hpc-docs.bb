SUMMARY = "Dependency package for openmpi_4_1_4-gnu-hpc-docs"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-docs provides the dependency to get binary package openmpi_4_1_4-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-gnu-hpc-docs-4.1.4-2.3.noarch.rpm"
RPM_HASH = "d7061e8dbb4a63606eda3ac5a51959b37cc4519a02f705d21c01f452f355bebe3f2ee4b8b6e7d761cadd41a457ec236bb7518505b698cefee0dd8f8451b4d937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-4-1-4-gnu-hpc-docs"

inherit rpm
