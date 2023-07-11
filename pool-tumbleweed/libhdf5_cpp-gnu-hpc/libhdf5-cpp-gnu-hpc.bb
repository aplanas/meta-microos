SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "a48d892427b9d9993fa2bcdea1dbbf2aad9c86230495abf9ed2bb775ebc9892f0554d870dc8e35b5d21becc327f9889d12555ec8e431eafd4ffef6c9c85207aa"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-hpc"

inherit rpm
