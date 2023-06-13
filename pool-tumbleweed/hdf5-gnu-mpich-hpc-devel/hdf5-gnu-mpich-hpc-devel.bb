SUMMARY = "Dependency package for hdf5_1_12_2-gnu-mpich-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-mpich-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-mpich-hpc-devel-1.12.2-5.2.noarch.rpm"
RPM_HASH = "d0bef2fffc1ef011882dac18eed9506d0a4aa1573607aac0f78142e941ac45af16d5d37dc7b15b2aab5b6d83ea5dfda32f1fdbd402bba0ed0510fa96025840db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "hdf5_1_12_2-gnu-mpich-hpc-devel"

inherit rpm
