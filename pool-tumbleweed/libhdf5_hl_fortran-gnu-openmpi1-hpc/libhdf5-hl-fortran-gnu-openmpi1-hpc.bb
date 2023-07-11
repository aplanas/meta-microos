SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "8a8b997a97ac1046298c3c2aa036320c41b790cb1fd5dd92cae5f46bb9e30ce895e5298df2452ccef07f74fd37ab16c14c9541fad508e83126bdd2c7bf179988"

RPROVIDES:${PN} += "libhdf5-hl-fortran-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "libhdf5hl-fortran-1-12-2-gnu-openmpi1-hpc"

inherit rpm
