SUMMARY = "Development files for hdf5_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi3-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi3-hpc-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "f45922825af726c32fe444487118e928f9756d46eab3afa0398355dad8a15b90bc8ffbbf614858732edf8c985ee6879a2e84d194a58704b293870ccc027761c8"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
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
