SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "d05369fba09e84f7235711cd641078bcce6936b9c32c401e970f8f4668940e8fd24ce9348e0a43750a5a335a73e30d3cf585677a68be6fb7995364684fc16740"

RPROVIDES:${PN} += "libhdf5-hl-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "libhdf5-hl-1-12-2-gnu-openmpi2-hpc"

inherit rpm
