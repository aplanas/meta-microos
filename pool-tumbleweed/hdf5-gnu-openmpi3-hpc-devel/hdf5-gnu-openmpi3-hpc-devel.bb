SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi3-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi3-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi3-hpc-devel-1.12.2-5.2.noarch.rpm"
RPM_HASH = "7357419d57b4c508f9f058e6e3bbc352bd50a9883d9a4de75f6a032b6153c09a6d7cf30d5e0b36ef3e4c947e9e66d86c9f50f3a08e7c66a82f854194344ed909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi3-hpc-devel"

inherit rpm
