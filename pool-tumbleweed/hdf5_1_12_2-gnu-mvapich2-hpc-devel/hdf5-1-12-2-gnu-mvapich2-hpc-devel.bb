SUMMARY = "Development files for hdf5_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-mvapich2-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mvapich2-hpc-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "b9f927861e6b1f8217b38313f2de259b081ba810452159a03577df1a8bd114b320965be3226152d4551b592e8d4f676507becd8ded2817205cd07846a09df23a"

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
