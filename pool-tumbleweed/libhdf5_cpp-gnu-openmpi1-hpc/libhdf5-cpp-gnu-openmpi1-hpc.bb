SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "471fe7cde77329561101ecc40e4076b5637676d06b17cb1534ff7d5a55d48a2971e683fc88ee6b93f17060277b973842c3ef52ff1f6ebe77327865342663d9bc"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi1-hpc"

inherit rpm
