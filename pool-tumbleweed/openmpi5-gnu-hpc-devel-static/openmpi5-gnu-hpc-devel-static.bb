SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-devel-static provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-devel-static-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "a79555fdf64f712a2c01e383fa523d6cbe52a43c3efcd171e267843dcc4dc0110b4de84d596884180bca3366986f1984b3a4b4ac353d14809e6c7eadf387cff0"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel-static"

inherit rpm
