SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "ac7d60707a09140a53e7b30da3574636b82defd97ee487d5be8ddf654badcc7980025904d37566904cf1a0f2c24e3052f1043cd99b939ebb3dc45d176f0ef3bb"

RPROVIDES:${PN} += "libhdf5-hl-cpp-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-openmpi2-hpc"

inherit rpm
