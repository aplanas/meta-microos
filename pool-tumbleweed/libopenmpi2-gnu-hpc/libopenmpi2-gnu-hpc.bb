SUMMARY = "Dependency package for libopenmpi_2_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package libopenmpi2-gnu-hpc provides the dependency to get binary package libopenmpi_2_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "libopenmpi2-gnu-hpc-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "3eb6cb0b7e260ff034b7c70c54f46376ebb6b85105a78e14574a0a1469fa76cfec2c562b073eb98d947015c6598606b6013e7e7ed504435d85ae6ef5c2d23807"

RPROVIDES:${PN} += "libopenmpi2-gnu-hpc"

RDEPENDS:${PN} += "libopenmpi-2-1-6-gnu-hpc"

inherit rpm
