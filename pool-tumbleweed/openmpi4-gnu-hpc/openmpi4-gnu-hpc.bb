SUMMARY = "Dependency package for openmpi_4_1_5-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc provides the dependency to get binary package openmpi_4_1_5-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_4_1_5-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi4-gnu-hpc-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "1eaec30cb18c7c556d501c9c077a1ad904dc841f7bc3032abf099e2c6e11bc8970d55f39d1083ea6f63ff4dfba3be59e0ad3693f3b423b63637a6ea1a3c164ab"

RPROVIDES:${PN} += "openmpi4-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-4-1-5-gnu-hpc"

inherit rpm
