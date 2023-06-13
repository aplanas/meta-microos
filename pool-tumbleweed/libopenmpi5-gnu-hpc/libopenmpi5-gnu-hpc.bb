SUMMARY = "Dependency package for libopenmpi_5_0_0-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package libopenmpi5-gnu-hpc provides the dependency to get binary package libopenmpi_5_0_0-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "libopenmpi5-gnu-hpc-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "cd341d5d99fdc0e3f956275e688ff2687c7883480eac08e6025cc8dfea3d4d7ec6e8810f502611145b9ae5158e369010fe0af7d9005d0217404115a1d09faa82"

RPROVIDES:${PN} += "libopenmpi5-gnu-hpc \
libopenmpi5-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "libopenmpi_5_0_0-gnu-hpc"

inherit rpm
