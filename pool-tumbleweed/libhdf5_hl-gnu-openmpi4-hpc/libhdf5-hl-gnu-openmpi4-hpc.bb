SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-openmpi4-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "3b00a690f5677aacfee4f1d92ef4d0b0f25bb41e4bf0dfb215507a546696713350972793837d698ee1b81e367417a52731a6000d0fb1ce315c815145b9bd96af"

RPROVIDES:${PN} += "libhdf5_hl-gnu-openmpi4-hpc \
libhdf5_hl-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "libhdf5_hl_1_12_2-gnu-openmpi4-hpc"

inherit rpm
