SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc-devel-static provides the dependency to get binary package openmpi_5_0_0-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-devel-static-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "9d9b2abd406d01e59557fb90a6955850a69193bc7249f534ecaf1a2b37e19a9c5cf84275e9ed209d8e5a953ccf8895a83b7a9d5eea71447993d29696e3330ddc"

RPROVIDES:${PN} += "openmpi5-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel-static"

inherit rpm
