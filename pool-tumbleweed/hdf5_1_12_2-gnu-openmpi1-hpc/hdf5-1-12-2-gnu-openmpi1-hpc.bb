SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "76e1af13394804a8d575ae76604a17b19e9938a4556d340fcb964c73d963ead34bee75ec707c8332fc034dd7e2563434e98c5b900d3fda1b5f084055a8f4bd0f"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-1-12-2-gnu-openmpi1-hpc \
libhdf5-fortran-1-12-2-gnu-openmpi1-hpc \
libhdf5-hl-1-12-2-gnu-openmpi1-hpc \
libhdf5hl-fortran-1-12-2-gnu-openmpi1-hpc \
libm.so.6 \
libopenmpi1-gnu-hpc \
lua-lmod"

inherit rpm
