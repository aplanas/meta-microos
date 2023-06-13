SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi4-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi4-hpc-1.12.2-5.1.noarch.rpm"
RPM_HASH = "e99fd195f20cb53772199eb01422d350af8c451eaa6721004cfafc429c7eac78ee22eba674da3764d168ab5dacabcfba222d729c5c9f8ca647624dc49317e44e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "hdf5_1_12_2-gnu-openmpi4-hpc"

inherit rpm
