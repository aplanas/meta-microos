SUMMARY = "Dependency package for libopenmpi_5_0_0-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package libopenmpi5-gnu-hpc provides the dependency to get binary package libopenmpi_5_0_0-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "libopenmpi5-gnu-hpc-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "9fd63340071c18a0af6c71806648e3d9e062d355788c537fd33ef5ccb4289350fb5495570992fe5211fb9392001b9adb6669aeb89591fda79966839139969784"

RPROVIDES:${PN} += "libopenmpi5-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-5-0-0-gnu-hpc"

inherit rpm
