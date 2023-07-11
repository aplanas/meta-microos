SUMMARY = "Dependency package for hdf5_1_12_2-gnu-mpich-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-mpich-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-mpich-hpc-devel-1.12.2-5.3.noarch.rpm"
RPM_HASH = "1433f4ab59b50423f3f9fe9d3287248a82cce17ba86cbbbae008d5f486749682a5cc7c927bfe44e36854c9bbc692a636068ad978a7b83720d8bdc375f9a9b3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-mpich-hpc-devel"

inherit rpm
