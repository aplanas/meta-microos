SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-mpich-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "a2652ef299c56f6e28c05bcfd182dacffe3479adaf47fe7673ec6c55c9e38d36b3d5356277ce88a6939bca6a82848483adf98b73caa7b57fc8e86b75e35405ac"

RPROVIDES:${PN} += "libhdf5-fortran-gnu-mpich-hpc"

RDEPENDS:${PN} += "libhdf5-fortran-1-12-2-gnu-mpich-hpc"

inherit rpm
