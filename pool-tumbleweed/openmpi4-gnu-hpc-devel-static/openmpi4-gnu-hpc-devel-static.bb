SUMMARY = "Dependency package for openmpi_4_1_4-gnu-hpc-devel-static"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 4) \
The package openmpi4-gnu-hpc-devel-static provides the dependency to get binary package openmpi_4_1_4-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of openmpi_4_1_4-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-gnu-hpc-devel-static-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "0730717c463780e47c10aed38991b4ee37de24bfb2dcda6d98810df5764207682bf56680d853ce9e1cf85cbbe99a20b059debd983c011101e59c4389b08814f4"

RPROVIDES:${PN} += "openmpi4-gnu-hpc-devel-static"

RDEPENDS:${PN} += "openmpi-4-1-4-gnu-hpc-devel-static"

inherit rpm
