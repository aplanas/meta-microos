SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mpich-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "23dde83a2d7915eab5833821040b39de142aa72e8c9e50537aac1fb6983d45d255da1fa42b273dced13544373d814b67d4915db39757eb4eb8d0f2b47632038d"

RPROVIDES:${PN} += "libhdf5hl-fortran-1-12-2-gnu-mpich-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-mpich-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5"

inherit rpm
