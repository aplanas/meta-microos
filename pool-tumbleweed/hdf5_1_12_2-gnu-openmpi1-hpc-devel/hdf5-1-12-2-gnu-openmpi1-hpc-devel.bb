SUMMARY = "Development files for hdf5_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi1-hpc-devel-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "5c44b6a5e36ed924329490681b42e584f8114156cf7d3b38054e7d5f01bfc0e1b4775e4d44563f323f42992e477dbc27419e5561e4050c50979740a1f5334553"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-1-12-2-gnu-openmpi1-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5-1-12-2-gnu-openmpi1-hpc \
libhdf5-cpp-1-12-2-gnu-openmpi1-hpc \
libhdf5-fortran-1-12-2-gnu-openmpi1-hpc \
libhdf5-hl-1-12-2-gnu-openmpi1-hpc \
libhdf5-hl-cpp-1-12-2-gnu-openmpi1-hpc \
libhdf5hl-fortran-1-12-2-gnu-openmpi1-hpc \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
openmpi1-gnu-hpc-devel \
zlib-devel"

inherit rpm
