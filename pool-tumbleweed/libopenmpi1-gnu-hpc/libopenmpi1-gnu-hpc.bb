SUMMARY = "Dependency package for libopenmpi_1_10_7-gnu-hpc"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package libopenmpi1-gnu-hpc provides the dependency to get binary package libopenmpi_1_10_7-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "libopenmpi1-gnu-hpc-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "cc93e4bb63086c1eed81134c2ee9cf0d2c44ea7d5c261e886c635a0e82ad4c86d6854dc9872a35fa0212591877cf49cab086ef3a1f9d02a6ef3f9371b82cf7f5"

RPROVIDES:${PN} += "libopenmpi1-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-1-10-7-gnu-hpc"

inherit rpm
