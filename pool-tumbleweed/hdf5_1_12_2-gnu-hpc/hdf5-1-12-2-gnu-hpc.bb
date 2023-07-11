SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "9416148ac3292a9eb2447d3d122ad55d66311c4a6aabbb172b781d4c796325294fe3d236d37605406b1877df7c42825348268b8c99b4d073e6b7961f3fe27cdb"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-1-12-2-gnu-hpc \
libhdf5-cpp-1-12-2-gnu-hpc \
libhdf5-fortran-1-12-2-gnu-hpc \
libhdf5-hl-1-12-2-gnu-hpc \
libhdf5-hl-cpp-1-12-2-gnu-hpc \
libhdf5hl-fortran-1-12-2-gnu-hpc \
lua-lmod"

inherit rpm
