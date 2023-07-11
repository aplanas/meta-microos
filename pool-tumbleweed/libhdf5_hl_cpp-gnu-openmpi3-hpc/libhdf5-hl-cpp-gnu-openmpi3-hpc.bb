SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "3626ae058b64b5c99eaebf19c690431888af21c97253b38318ff4762895bb366ef2b94f058b55f264a58ef34382feaf52e5cf980a13be4c6503bda3e870893fb"

RPROVIDES:${PN} += "libhdf5-hl-cpp-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-openmpi3-hpc"

inherit rpm
