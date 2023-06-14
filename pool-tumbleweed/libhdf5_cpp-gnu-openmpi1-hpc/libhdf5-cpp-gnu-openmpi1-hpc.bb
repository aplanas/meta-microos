SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "3a56aa53afa8a99fa1d3b999113bfaa007e0a1418e8c394c0ba35f00cf8d25c61590c0399c734ae242bd91acfef34cd56bed2908b6c728afbc3da6c43f0d1471"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi1-hpc"

inherit rpm
