SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi1-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi1-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi1-hpc-devel-1.12.2-5.2.noarch.rpm"
RPM_HASH = "4fa5db0953a9d0d1911ab86214c3f193f430e52691c9a0f6e25e54e487dd704073ef0936d34e15a569f5a101b3d92fad27f81e46f8e71fa6cf7f40f69cd9b259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi1-hpc-devel"

inherit rpm
