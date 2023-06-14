SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-openmpi4-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "0862aad3b63fa737bfaf1884e70a9fa99cfebce1d102c67ff77cf09b8b8fdd4be7879aaf0cffa906fcd818eb91b08f3173f46e1caee9abba7b25cfaee93c5b30"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi4-hpc"

inherit rpm
