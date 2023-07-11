SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc provides the dependency to get binary package openmpi_3_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "0702282e70e48a6bd77908b353a3be772c113f379822012ec2a295d2c57481a1412bd0ac9b59d904f5d89ce03ceedb794525db9d76610913e5fef9d8156383d2"

RPROVIDES:${PN} += "openmpi3-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-3-1-6-gnu-hpc"

inherit rpm
