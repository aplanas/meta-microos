SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc provides the dependency to get binary package openmpi_5_0_0-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "7667c6222476c03c99976d910700690b5d9ee9f1ae51d796553abed698eed8a93313fea9ab9c3cbe8009bae2c3681e481559d4debab9440b0f532c76ffce3415"

RPROVIDES:${PN} += "openmpi5-gnu-hpc \
openmpi5-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
openmpi_5_0_0-gnu-hpc"

inherit rpm
