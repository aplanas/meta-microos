SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi2-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran_1_12_2-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5feebbcb50057c0079c6bc504c2b88a04643f54c1349abb1b847dec392c12d1362e082f440a55d569486b71946264302d29e5edcc36ee87a6e7a8d19ac3253fc"

RPROVIDES:${PN} += "libhdf5-fortran-1-12-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5"

inherit rpm
