SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi4-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "921fe8f8e2fc854d3847fe370c230da234912473175ad9ef40c972c1c40caa7dc9da4e7c2f4d83bbcf2adcdcd3ae415457b63bd930bde476698a38f207907950"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
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
