SUMMARY = "Development files for hdf5_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-mvapich2-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mvapich2-hpc-devel-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "596602a7ed348fb69b76fde2926c2863899aaa9d2b79775d29dbe4899816ade69e9fe5821844129c1024ba1c13b9b99febf955f44923d72065f91d420dfa1255"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-1-12-2-gnu-mvapich2-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5-1-12-2-gnu-mvapich2-hpc \
libhdf5-cpp-1-12-2-gnu-mvapich2-hpc \
libhdf5-fortran-1-12-2-gnu-mvapich2-hpc \
libhdf5-hl-1-12-2-gnu-mvapich2-hpc \
libhdf5-hl-cpp-1-12-2-gnu-mvapich2-hpc \
libhdf5hl-fortran-1-12-2-gnu-mvapich2-hpc \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
mvapich2-gnu-hpc-devel \
zlib-devel"

inherit rpm
