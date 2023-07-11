SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mpich-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "1409e6cd1139fea696cfd85009b2cfc89c705399dde1fbc801cf7291c0ce367dcac73401e1ef3743cda4e502e89549aa626f65cb77e0df40297955ae2e3f3244"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-1-12-2-gnu-mpich-hpc \
libhdf5-fortran-1-12-2-gnu-mpich-hpc \
libhdf5-hl-1-12-2-gnu-mpich-hpc \
libhdf5hl-fortran-1-12-2-gnu-mpich-hpc \
libm.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
