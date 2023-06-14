SUMMARY = "Development files for hdf5_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi4-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi4-hpc-devel-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "12d59244ba22677a177d374b8874504bc15f60563cb19725516682ff7fe548f11a0d82b09b273c40115d235a68e1139344832852bc8d1cee4d549d2e8fa9ea27"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
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
