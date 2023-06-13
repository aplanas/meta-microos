SUMMARY = "Dependency package for hdf5_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-mpich-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-mpich-hpc-1.12.2-5.2.noarch.rpm"
RPM_HASH = "4a01e30b6f0731fee8f69de8d8e4aa90942c2c80d6eb48ecba9932b76edfd0ca736672d41dde0c919cdd28183a6d25caed8739aadec4df10b34d70d48b81d31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-mpich-hpc"

RDEPENDS:${PN} += "hdf5_1_12_2-gnu-mpich-hpc"

inherit rpm
