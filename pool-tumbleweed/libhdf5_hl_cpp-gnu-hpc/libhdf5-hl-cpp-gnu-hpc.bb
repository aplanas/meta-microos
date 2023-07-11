SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "1ba79cb036a8a98625a7bbcdcffca2e1bf1f037429fa5380f6b764a084835d3efc53ff31fee702d2f3b5df28c5069db037d499fcd069be55571743079eea2e3d"

RPROVIDES:${PN} += "libhdf5-hl-cpp-gnu-hpc"

RDEPENDS:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-hpc"

inherit rpm
