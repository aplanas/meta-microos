SUMMARY = "Development files for hdf5_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-mpich-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mpich-hpc-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "73eff26d9985145037872431826a80101baa9980c81f3b787be519081bda46e3ef8556107685e7234ad8ca65aee2637380549b3c13078201e57bf2abfe19cc36"

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
