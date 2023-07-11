SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi3-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi3-hpc-1.12.2-5.2.noarch.rpm"
RPM_HASH = "385e29d742cc2c06fca444ec77b4c06acc56af830a1187f4f691614756867a2eeba09a427b66f1b250cb7fc1d8e7b6a039dc13fea42ff21f0cddb6b47aa45df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi3-hpc"

inherit rpm
