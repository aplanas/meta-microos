SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-mvapich2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "3c87fb71a73f64bcea351e7ec4d7472f2d998f6eed26df960a5cbdf8ea998a7d6f5a2ef91b4c4c5a21c776fcf5511173cac36e8d0717c16527a6b194510fd3c1"

RPROVIDES:${PN} += "libhdf5-hl-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "libhdf5-hl-1-12-2-gnu-mvapich2-hpc"

inherit rpm
