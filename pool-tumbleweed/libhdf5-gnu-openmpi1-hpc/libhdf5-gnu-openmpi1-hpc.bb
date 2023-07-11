SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "59e04952defc33959148b3506a44b34881e3c01f2f5e10630f72428c66aee2f515c9d958eff3a1c414befb5f0cbdc55c31cac01a3ba29a01882c3f1b9257ecf5"

RPROVIDES:${PN} += "libhdf5-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "libhdf5-1-12-2-gnu-openmpi1-hpc"

inherit rpm
