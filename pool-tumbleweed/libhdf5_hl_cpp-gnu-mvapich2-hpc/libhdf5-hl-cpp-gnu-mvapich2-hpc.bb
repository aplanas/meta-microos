SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-mvapich2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "7a32737f5daba879bba4fcf3f59261d03979573e18e3b9f4bb1a16f20e945936299bfd9d4abac991b9f434ce25cb721fcc14537fcfa6819647e7e3694f613e2d"

RPROVIDES:${PN} += "libhdf5-hl-cpp-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-mvapich2-hpc"

inherit rpm
