SUMMARY = "Dependency package for openmpi_3_1_6-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi3-gnu-hpc-devel-static provides the dependency to get binary package openmpi_3_1_6-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_3_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-gnu-hpc-devel-static-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "634b2753e820463f61e78025547d9fc4b5bf1d31281ecfe5e998b4a3a29917967525151080ec48f585003f70d19f2ebcfb19d3ff8f61894af3403bfa42ba2594"

RPROVIDES:${PN} += "openmpi3-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-devel-static"

inherit rpm
