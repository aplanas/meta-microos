SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-docs"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-docs provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-docs-1.10.7-7.5.noarch.rpm"
RPM_HASH = "0c3e4688ed172f42af2a788feaf9104aa61d91350e58af7244cb639dc87cf5a414f4736339f4052b8e2b66f456440573475f7b4566e23e06e13583ef287c8cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-docs"

inherit rpm
