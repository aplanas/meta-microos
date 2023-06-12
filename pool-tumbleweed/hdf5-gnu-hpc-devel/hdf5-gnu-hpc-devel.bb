SUMMARY = "Dependency package for hdf5_1_12_2-gnu-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-hpc-devel-1.12.2-5.2.noarch.rpm"
RPM_HASH = "f533023dad7e610d15298c8271e2c683edfb1e6afccc5176628e86ce3df16ca771a513ce8f031c9fe683a084d8ff6755e8f849834f67fd02e06ae05f7c7133ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-hpc-devel"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-hpc-devel"

inherit rpm
