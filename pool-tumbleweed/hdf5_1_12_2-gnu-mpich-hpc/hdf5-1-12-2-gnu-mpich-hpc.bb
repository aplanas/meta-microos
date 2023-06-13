SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mpich-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "2f0e8ee170640fa40cb99022ecdfe02727c227d653c24ce779cdfdb03b55ddbc0a4c349533e8875efa67b354ed6e1e3fd9d47569ebeb34283eb6cba14af996ea"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-mpich-hpc \
hdf5_1_12_2-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhdf5_1_12_2-gnu-mpich-hpc \
libhdf5_fortran_1_12_2-gnu-mpich-hpc \
libhdf5_hl_1_12_2-gnu-mpich-hpc \
libhdf5hl_fortran_1_12_2-gnu-mpich-hpc \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
