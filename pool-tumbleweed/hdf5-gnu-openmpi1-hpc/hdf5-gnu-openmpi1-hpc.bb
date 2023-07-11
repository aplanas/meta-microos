SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi1-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi1-hpc-1.12.2-5.3.noarch.rpm"
RPM_HASH = "3f4176e07b4bd665c76c748d8ef39ca7e75ebe379dc95f50ce4836dfb8632c4f914d98f8aa1f02f03a30880fd0ef6e5a8a53e00767db5b3262135a25b3ea5a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi1-hpc"

inherit rpm
