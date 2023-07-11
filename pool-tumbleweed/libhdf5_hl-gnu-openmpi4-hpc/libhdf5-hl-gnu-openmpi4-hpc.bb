SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ce63043e9239e60677b26462a6dfc58a3bcb5fbc250f70a3c0b4fd46574ca6895f6816202378df500df08d619b6334f9e6d714ef9a1025d130f66abedacc3a4a"

RPROVIDES:${PN} += "libhdf5-hl-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "libhdf5-hl-1-12-2-gnu-openmpi4-hpc"

inherit rpm
