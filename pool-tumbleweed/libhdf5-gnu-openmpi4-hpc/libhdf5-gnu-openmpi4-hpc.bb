SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-openmpi4-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "ef6629e20df0b73aeba8044756aca4ebe631f1fce1ff7c66cfd0d455b07a31cb53aea31272b5b1ba4ba22b3118154937bd0cd63d3a28c95c646dffabdaafc48e"

RPROVIDES:${PN} += "libhdf5-gnu-openmpi4-hpc \
libhdf5-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "libhdf5_1_12_2-gnu-openmpi4-hpc"

inherit rpm
