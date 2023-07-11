SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "f82b3930057ba66553f5fae4838cdbe4a123b1ccfc94ab0a682e1142fdeefe243e60036ed5eaec844da2195520f10e001828f3580df42987d49eac0709a70141"

RPROVIDES:${PN} += "libhdf5-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "libhdf5-1-12-2-gnu-openmpi4-hpc"

inherit rpm
