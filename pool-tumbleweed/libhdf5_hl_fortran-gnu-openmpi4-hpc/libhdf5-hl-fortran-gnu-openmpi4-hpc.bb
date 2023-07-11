SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "1b5aa90cdb997e43345a899c86311d238fbc421871155b849df749842cc4ef17738ec860b4766ea0007426a09148c8fbd620d9af3c2e31c89a9d8702dbd577fa"

RPROVIDES:${PN} += "libhdf5-hl-fortran-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "libhdf5hl-fortran-1-12-2-gnu-openmpi4-hpc"

inherit rpm
