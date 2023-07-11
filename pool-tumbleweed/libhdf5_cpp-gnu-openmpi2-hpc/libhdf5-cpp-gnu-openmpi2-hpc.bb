SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "7399420c38f187c4e00fd69cd65a8cf6a688727d90fed221f44dc101687190d7766c58b34fe61b7ed658bac8b15f6976c44799fc923e24a3167eda5f4265f115"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi2-hpc"

inherit rpm
