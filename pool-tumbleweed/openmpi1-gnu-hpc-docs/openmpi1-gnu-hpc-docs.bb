SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-docs"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-docs provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-docs. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-docs-1.10.7-7.6.noarch.rpm"
RPM_HASH = "0de68346e3edb81570b9eef2bdff43cbf32e69a3a7b0c6915d679021c2a13b301ccec525e817a80b04a107e9168816220a1fd4f90581d7494170641d09f4a0bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-docs"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-docs"

inherit rpm
