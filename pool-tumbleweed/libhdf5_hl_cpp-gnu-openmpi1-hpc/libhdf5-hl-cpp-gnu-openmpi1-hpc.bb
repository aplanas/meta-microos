SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "1e22335a8ad6b8555dfa89f028d7e5fa93164ca0313dc934fff488ac372a2eb03e30f6a871e6c341f07c186fbd5028433a885a15da8e62461e7907003d4b997b"

RPROVIDES:${PN} += "libhdf5-hl-cpp-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-openmpi1-hpc"

inherit rpm
