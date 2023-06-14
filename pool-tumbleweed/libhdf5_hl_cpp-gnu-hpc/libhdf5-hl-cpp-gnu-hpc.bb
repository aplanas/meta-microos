SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "20c971806b7ed37dea7f0156fb2427a8ce9ee295dd4037942ad0e6e6688de7ba3bbe5787e125d54daab54b485f5653c58466ba065f17707930f044474b1cdedd"

RPROVIDES:${PN} += "libhdf5-hl-cpp-gnu-hpc"

RDEPENDS:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-hpc"

inherit rpm
