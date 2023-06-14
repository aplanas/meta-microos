SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "6aef47f71168b0a17c7c77864c66c4ecd5bb1fc01ba1f342d6e621fa88c4159166ee387d8f228f6ee76f957bdc561bdef26429f472613e7125d75bc7ff4bc431"

RPROVIDES:${PN} += "libhdf5-hl-cpp-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-openmpi3-hpc"

inherit rpm
