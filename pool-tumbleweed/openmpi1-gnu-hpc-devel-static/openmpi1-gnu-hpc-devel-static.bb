SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc-devel-static provides the dependency to get binary package openmpi_1_10_7-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-devel-static-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "06c18caaa97a2ce6ccb0b3d6bfd1cf88040a8d406cc78c0bea451fb60c93c1252ee7b22cceb52c1c40cf1bb3055c7828a96b25d5872499c6cebd159213bfddaf"

RPROVIDES:${PN} += "openmpi1-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-devel-static"

inherit rpm
