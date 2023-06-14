SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mvapich2-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "6233a5fff99ddfcce7ce53dfb0342cc9d1e5d9c1ddd1089b685821e09b9862767fb2f978f71e9ee6a0d607b5e6b8c5b80a36825b9a858205fd9b667242a957fc"

RPROVIDES:${PN} += "libhdf5hl-fortran-1-12-2-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-mvapich2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5"

inherit rpm
