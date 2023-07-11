SUMMARY = "Development files for hdf5_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-mpich-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mpich-hpc-devel-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "123c9e6239519f79f6a5383ac11aa27e23fe6e2b4a865d3974667573282ba0355a6e3b368a35aa92e9b6dd4a3c629b41e5c8ec4c8d404446a4b5469bef534580"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-1-12-2-gnu-mpich-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5-1-12-2-gnu-mpich-hpc \
libhdf5-cpp-1-12-2-gnu-mpich-hpc \
libhdf5-fortran-1-12-2-gnu-mpich-hpc \
libhdf5-hl-1-12-2-gnu-mpich-hpc \
libhdf5-hl-cpp-1-12-2-gnu-mpich-hpc \
libhdf5hl-fortran-1-12-2-gnu-mpich-hpc \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
mpich-gnu-hpc-devel \
zlib-devel"

inherit rpm
