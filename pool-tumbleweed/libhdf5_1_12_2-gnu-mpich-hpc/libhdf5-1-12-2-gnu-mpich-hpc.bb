SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mpich-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_1_12_2-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "e97662e006799cef45bc9569fac8c45e4119f14c82fd8e2093faaf5b09e1116025eeeef7e00bfb70716cc28518ced2814bce36acee6ab14c130b19219c9c969f"

RPROVIDES:${PN} += "libhdf5-1-12-2-gnu-mpich-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-mpich-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
