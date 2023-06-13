SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mpich-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran_1_12_2-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5e652653d89eae03f6ac69844fdd25c2cfa7c2411a5e6f5fd092832c86f9ba90fb02c3c699c99f47a96372f377d788a829216a0239d164dbf454202353cc6fab"

RPROVIDES:${PN} += "libhdf5_fortran_1_12_2-gnu-mpich-hpc \
libhdf5_fortran_1_12_2-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-mpich-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit)"

inherit rpm
