SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "df979057fca4ef1dc9e422403076b21336fad3c229ab5478d7ee3faa3b77d265bad675d9912d676559927b24aca2be965c491850681b6bbbed3c5a895a70297e"

RPROVIDES:${PN} += "libhdf5-hl-cpp-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-openmpi4-hpc"

inherit rpm
