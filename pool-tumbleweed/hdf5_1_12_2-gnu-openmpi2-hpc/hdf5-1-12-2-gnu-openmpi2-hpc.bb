SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi2-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "22827dadca8657c66008f25bf6501ccbc7da412a59d66dc8f2834175d402fb11585ab0491b0a3bc28a082a81d3b59785b408cb7c129a813a9363b757ad845f6c"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-1-12-2-gnu-openmpi2-hpc \
libhdf5-fortran-1-12-2-gnu-openmpi2-hpc \
libhdf5-hl-1-12-2-gnu-openmpi2-hpc \
libhdf5hl-fortran-1-12-2-gnu-openmpi2-hpc \
libm.so.6 \
libopenmpi2-gnu-hpc \
lua-lmod"

inherit rpm
