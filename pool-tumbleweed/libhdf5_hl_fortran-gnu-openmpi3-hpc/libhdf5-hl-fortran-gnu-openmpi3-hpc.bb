SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5ed392cda74be957791ccdf516ab60d360be50f118e7651c02d4a348fb3841eb062d989087cd019a94eb2923dbf5e7618faa7aa1993f438e46adaf74b751884c"

RPROVIDES:${PN} += "libhdf5-hl-fortran-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "libhdf5hl-fortran-1-12-2-gnu-openmpi3-hpc"

inherit rpm
