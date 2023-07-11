SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-mvapich2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "e2d3db0893702bfaf66f2a400a3f11ede362059546fd2120db4b52e5b8fbe6a1bfdb2b5229fcc71b3cd5cf0b1390495e7791c210805d0f0e921b6b755e3a4574"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-mvapich2-hpc"

inherit rpm
