SUMMARY = "Development files for hdf5_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi3-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi3-hpc-devel-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "896b018127cf8dd73af1742197fca92be96c07ce4e4e1e8c81c69f7680cc758704375cc7c8f58294ac049f3b4a73bd7be8a7568d3ded0585cb498dd40562d313"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
hdf5-1-12-2-gnu-openmpi3-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5-1-12-2-gnu-openmpi3-hpc \
libhdf5-cpp-1-12-2-gnu-openmpi3-hpc \
libhdf5-fortran-1-12-2-gnu-openmpi3-hpc \
libhdf5-hl-1-12-2-gnu-openmpi3-hpc \
libhdf5-hl-cpp-1-12-2-gnu-openmpi3-hpc \
libhdf5hl-fortran-1-12-2-gnu-openmpi3-hpc \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
openmpi3-gnu-hpc-devel \
zlib-devel"

inherit rpm
