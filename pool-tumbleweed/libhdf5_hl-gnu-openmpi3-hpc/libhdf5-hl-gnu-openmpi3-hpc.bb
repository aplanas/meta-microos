SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "a26ae2a5c8c5991673b010756dbe4f43a7a63303f2137e8008bcee45bedbafa31760f9516bdaa3429b427768bff75f30e0caf7615e4ad270bd3225385dcc76ec"

RPROVIDES:${PN} += "libhdf5-hl-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "libhdf5-hl-1-12-2-gnu-openmpi3-hpc"

inherit rpm
