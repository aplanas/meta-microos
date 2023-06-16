SUMMARY = "Development files for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-hpc-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "9d1e61c977454f852a5814feff95d8ce5c952c699889043256b1ff27a253c63ad83db6248d9200041f3a07d6ce73982f78eee277b90c91379dca8b724e872ee7"

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
