SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "20389688afe2eb89a818203544cd81633b4e5c023414ced5e499994c843f643314f639cd6111068e4bd2533e04a5342d32401b07e6677e6f5ea1e9d66f82893b"

RPROVIDES:${PN} += "libhdf5-fortran-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "libhdf5-fortran-1-12-2-gnu-openmpi3-hpc"

inherit rpm
