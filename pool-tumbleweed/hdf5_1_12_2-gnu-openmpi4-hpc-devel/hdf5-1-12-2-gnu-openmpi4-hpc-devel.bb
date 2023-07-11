SUMMARY = "Development files for hdf5_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi4-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi4-hpc-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "85e4e550cda61ea2c5862e3ac3fdf796be7b196bf9927b3219af9fe1571b94491a75ea831680140b9e09f3282ab6f80cfe3beacb38760a620dbfa440b5cf8c2f"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-1-12-2-gnu-openmpi4-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5-1-12-2-gnu-openmpi4-hpc \
libhdf5-cpp-1-12-2-gnu-openmpi4-hpc \
libhdf5-fortran-1-12-2-gnu-openmpi4-hpc \
libhdf5-hl-1-12-2-gnu-openmpi4-hpc \
libhdf5-hl-cpp-1-12-2-gnu-openmpi4-hpc \
libhdf5hl-fortran-1-12-2-gnu-openmpi4-hpc \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
openmpi4-gnu-hpc-devel \
zlib-devel"

inherit rpm
