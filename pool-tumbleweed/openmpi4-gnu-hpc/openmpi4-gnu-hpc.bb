SUMMARY = "Dependency package for openmpi_4_1_4-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc provides the dependency to get binary package openmpi_4_1_4-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-gnu-hpc-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "207c7c778f6e7a31649fe21e1db8e90d749cedf0039a6b0b997695aa0cb8050d4eef72c7ec93cb6a4046f1fb7c0c278558dae51ad9a9d9fbb44e47c47d1286ef"

RPROVIDES:${PN} += "openmpi4-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-4-1-4-gnu-hpc"

inherit rpm
