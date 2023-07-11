SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-mvapich2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "76ebc29c177eed0491291648894dd57edb16f775f59dd2e5ede58a87709178045d85c2c25216e1f1a2b3187bd150c77de91f6da67bf1c22b4644cb122ce00bd7"

RPROVIDES:${PN} += "libhdf5-fortran-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "libhdf5-fortran-1-12-2-gnu-mvapich2-hpc"

inherit rpm
