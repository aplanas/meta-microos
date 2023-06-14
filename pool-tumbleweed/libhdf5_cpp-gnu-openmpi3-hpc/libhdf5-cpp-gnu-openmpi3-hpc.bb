SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "aed1659607c70ee3561a0fccd33f0e7f4d74aab6f6081cfd934084779f3ec0e6a5e2b1ae5a2d931b11fb4c7258edb594dee95957f64ab90b1979dbec194273d6"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi3-hpc"

inherit rpm
