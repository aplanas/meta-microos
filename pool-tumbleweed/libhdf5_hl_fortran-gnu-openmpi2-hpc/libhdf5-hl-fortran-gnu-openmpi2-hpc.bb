SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "2986054c0961008d262a4ba2014c5a774c4524084e886a7e5ad6094815ad7cc7724908025307d3aa5e8f25b2ebf789420b641367d20e40caf6604afaf57b83b6"

RPROVIDES:${PN} += "libhdf5-hl-fortran-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "libhdf5hl-fortran-1-12-2-gnu-openmpi2-hpc"

inherit rpm
