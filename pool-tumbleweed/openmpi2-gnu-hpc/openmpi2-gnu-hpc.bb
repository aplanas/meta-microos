SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc provides the dependency to get binary package openmpi_2_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "d57a8808230ce17043dc694da4b297fadb99e2104057af4f57a98080540c6e2ceba154027b0a8b19b875032cab390daabbbff078342db714a49c1d388c5ab6bf"

RPROVIDES:${PN} += "openmpi2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-2-1-6-gnu-hpc"

inherit rpm
