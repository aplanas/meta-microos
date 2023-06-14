SUMMARY = "Development files for hdf5_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the gnu-openmpi2-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi2-hpc-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "4d5a0ffea658d92f4f807bcdeb1f8c75de421bfece44cbd8bac32ad4a50d1ef00ca90078728cf6429a0be3adb35b607be1de54ea7faf8c40679d5ccc1fc129e6"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
hdf5-1-12-2-gnu-openmpi2-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5-1-12-2-gnu-openmpi2-hpc \
libhdf5-cpp-1-12-2-gnu-openmpi2-hpc \
libhdf5-fortran-1-12-2-gnu-openmpi2-hpc \
libhdf5-hl-1-12-2-gnu-openmpi2-hpc \
libhdf5-hl-cpp-1-12-2-gnu-openmpi2-hpc \
libhdf5hl-fortran-1-12-2-gnu-openmpi2-hpc \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
openmpi2-gnu-hpc-devel \
zlib-devel"

inherit rpm
