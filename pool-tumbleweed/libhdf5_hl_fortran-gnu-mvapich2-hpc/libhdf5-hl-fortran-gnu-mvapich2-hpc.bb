SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-mvapich2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "3d8ae0d2c43aa82eb90e4e1f22a35c7e38837631e32bd81383c9b39f23ffb42012b71b75066e4f099069913dbd2a80f4f60f26323843b3da8a947d336c3ac6e6"

RPROVIDES:${PN} += "libhdf5-hl-fortran-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "libhdf5hl-fortran-1-12-2-gnu-mvapich2-hpc"

inherit rpm
