SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi4-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "90bc949d3c00a2c27e63acf18a55807255ec8040a3b07e39a44cdc661f1c7e77f9dbbf605cc937f2d8f13bf31d08e8e71c28bd963e34131a5f25256f4419a6aa"

RPROVIDES:${PN} += "libhdf5hl-fortran-1-12-2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi4-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5"

inherit rpm
