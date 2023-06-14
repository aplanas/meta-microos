SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi4-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi4-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "0affa55259e933dadc97f4526458a8fa5cd98f8df2c40adfff14f4d1176ba589cccd189997e83cc5163f5c7889e1d59f7b4881c94e496d18b9f9b896ec25072e"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-1-12-2-gnu-openmpi4-hpc \
libhdf5-fortran-1-12-2-gnu-openmpi4-hpc \
libhdf5-hl-1-12-2-gnu-openmpi4-hpc \
libhdf5hl-fortran-1-12-2-gnu-openmpi4-hpc \
libm.so.6 \
libopenmpi4-gnu-hpc \
lua-lmod"

inherit rpm
