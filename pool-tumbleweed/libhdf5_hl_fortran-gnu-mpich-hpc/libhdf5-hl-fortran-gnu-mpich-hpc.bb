SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-mpich-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "368fc5641022fc8a764b825f9ab5358c399b0a7975cbe1def40a5d1e847529d91bc39022b5424562d427204a12f0c74014a9eb007e30ec1281c6f5be283132c5"

RPROVIDES:${PN} += "libhdf5-hl-fortran-gnu-mpich-hpc"

RDEPENDS:${PN} += "libhdf5hl-fortran-1-12-2-gnu-mpich-hpc"

inherit rpm
