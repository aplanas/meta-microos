SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "784d02c7307c595772a588a744ecf30ab0e4e0925ab4d264839409515fd6ec96d14f9f917144936126500f32c079814bed9b9b6b94ffdf7dd81d7c9074aedad8"

RPROVIDES:${PN} += "libhdf5_hl-gnu-openmpi1-hpc \
libhdf5_hl-gnu-openmpi1-hpc(aarch-64)"

RDEPENDS:${PN} += "libhdf5_hl_1_12_2-gnu-openmpi1-hpc"

inherit rpm
