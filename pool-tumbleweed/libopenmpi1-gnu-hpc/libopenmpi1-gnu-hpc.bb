SUMMARY = "Dependency package for libopenmpi_1_10_7-gnu-hpc"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package libopenmpi1-gnu-hpc provides the dependency to get binary package libopenmpi_1_10_7-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "libopenmpi1-gnu-hpc-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "ce42a1037d7776acff2098b181111cf636f796fe87649bbcc3c33b8efb2765cf01f1b237bae83ff0ff310239255068e43f07d8412eac43f5ab3cb125cd6eddc0"

RPROVIDES:${PN} += "libopenmpi1-gnu-hpc \
libopenmpi1-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "libopenmpi_1_10_7-gnu-hpc"

inherit rpm
