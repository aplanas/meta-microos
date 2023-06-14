SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "e6bfa35faf0f3e8f43d4dec2e44276a4c2d4ece22b9e645e85a40df7dc8123d2cbdbc32220555f903a152e70d4f97f1fdab4d0301e7ace8692a044bef715069f"

RPROVIDES:${PN} += "libhdf5-hl-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "libhdf5-hl-1-12-2-gnu-openmpi2-hpc"

inherit rpm
