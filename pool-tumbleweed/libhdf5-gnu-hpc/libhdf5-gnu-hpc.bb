SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "6fa2cbc7a7e69e40a49ea24af1337b0b7e81e2dc174d32a7c5f0df06fa2dadd51b4f8f455fcca8588397ad0f67ca2697469f26c30fee01c7a77548a1a27f58a4"

RPROVIDES:${PN} += "libhdf5-gnu-hpc"

RDEPENDS:${PN} += "libhdf5-1-12-2-gnu-hpc"

inherit rpm
