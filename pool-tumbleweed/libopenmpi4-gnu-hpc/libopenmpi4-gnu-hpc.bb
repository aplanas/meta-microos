SUMMARY = "Dependency package for libopenmpi_4_1_5-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package libopenmpi4-gnu-hpc provides the dependency to get binary package libopenmpi_4_1_5-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_4_1_5-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "libopenmpi4-gnu-hpc-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "9db8d65b847926f0719394305ed9ce19674c277d33916e8dd13e936719a8ee4a3518c692ab2c67f45fa8f2d9736bb3d13d12912a7270bb1a172d76233642be81"

RPROVIDES:${PN} += "libopenmpi4-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-4-1-5-gnu-hpc"

inherit rpm
