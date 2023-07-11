SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi4-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi4-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi4-hpc-devel-1.12.2-5.2.noarch.rpm"
RPM_HASH = "a7565dec7b57ebec70d8cf81c6e5c73a14e8b3275bb0d190e0b3d5ffd988aa2cdb3e0a0ac1f85b3c4b18c4485729b3d7fa9264d785acaa75421fe5b6e75a26f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc-devel"

inherit rpm
