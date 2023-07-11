SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "29b2741e4a3bdc7e9820b92de823d26473c79290efb7ccd1d6eba71c43e873d4dee27566306ef0122e3cd962d4ef22447b467b47efe2faf84b3646cc45297947"

RPROVIDES:${PN} += "libhdf5-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "libhdf5-1-12-2-gnu-openmpi3-hpc"

inherit rpm
