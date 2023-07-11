SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-mpich-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "e61f502e2db17da316074fb789b74ea6ebd8dfcd1a142598ace721c29a0d481a415438efb5399b8548ee4901ec734a05ad6741a306b5b2e600dca0acadd2037b"

RPROVIDES:${PN} += "libhdf5-hl-cpp-gnu-mpich-hpc"

RDEPENDS:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-mpich-hpc"

inherit rpm
