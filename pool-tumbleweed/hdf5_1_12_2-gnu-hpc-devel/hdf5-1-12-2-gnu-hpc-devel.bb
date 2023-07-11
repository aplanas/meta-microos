SUMMARY = "Development files for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-hpc-devel-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "819152dbaf9cbdb479b099811ccc9cab03385e909ad2c954bd2de4b72e8f41fe5fb04c2d1dbda877badc6a4476f4411cada0bcfab035fd9da16fb1629c5693fa"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-1-12-2-gnu-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5-1-12-2-gnu-hpc \
libhdf5-cpp-1-12-2-gnu-hpc \
libhdf5-fortran-1-12-2-gnu-hpc \
libhdf5-hl-1-12-2-gnu-hpc \
libhdf5-hl-cpp-1-12-2-gnu-hpc \
libhdf5hl-fortran-1-12-2-gnu-hpc \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
zlib-devel"

inherit rpm
