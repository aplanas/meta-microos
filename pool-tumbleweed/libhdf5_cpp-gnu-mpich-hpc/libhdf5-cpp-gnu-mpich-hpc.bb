SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-mpich-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "4c4056fb33473ba45b7dece5175a34263b3efb4eb6e1803cfbc2e9a8c0a360879b121e83f27876e4625caae9177f741f0f2a033de35f8884b37e8ed5af35cb6d"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-mpich-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-mpich-hpc"

inherit rpm
