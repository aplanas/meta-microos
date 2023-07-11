SUMMARY = "Dependency package for libopenmpi_1_10_7-gnu-hpc"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package libopenmpi1-gnu-hpc provides the dependency to get binary package libopenmpi_1_10_7-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "libopenmpi1-gnu-hpc-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "7b33b91a6a34628cf2c3e58f5a78161cc1fc5917aba9e3b94c12be9f58503920fc10f1d7191925420a90126a02d3188ca24fe16ad63dd03916a5b121ac7b8dd8"

RPROVIDES:${PN} += "libopenmpi1-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-1-10-7-gnu-hpc"

inherit rpm
