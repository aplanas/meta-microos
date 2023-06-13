SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-openmpi4-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "5c19ab90b0cc924f9705e22689afc3c63412ecd2a714af3ea4dc5730768001cc55f6fe678bb8ecb3edb2279d71611e357d2970aff39009052f56f631d366a73e"

RPROVIDES:${PN} += "libhdf5_hl_fortran-gnu-openmpi4-hpc \
libhdf5_hl_fortran-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "libhdf5hl_fortran_1_12_2-gnu-openmpi4-hpc"

inherit rpm
