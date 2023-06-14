SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "b59a72e313fdd9e1c04f3c8a6ee6f05ff539e36d42dc09ade3887961f6d023a85ed9a14d8d74cfa1cd02035fc79e3ca0a8668a719550245997ae70a0a24eece3"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-mvapich2-hpc"

inherit rpm
