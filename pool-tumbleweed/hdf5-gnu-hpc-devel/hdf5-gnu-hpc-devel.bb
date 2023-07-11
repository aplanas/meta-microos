SUMMARY = "Dependency package for hdf5_1_12_2-gnu-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-hpc-devel-1.12.2-5.3.noarch.rpm"
RPM_HASH = "de958fbebd8ed66c4a8003b5ba9b15e71f93b4fec819926c8974c66d53587dd03a47ba13259d26748aafd7352b84d2ae2e69f959b925274de42feac9e88c9cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-hpc-devel"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-hpc-devel"

inherit rpm
