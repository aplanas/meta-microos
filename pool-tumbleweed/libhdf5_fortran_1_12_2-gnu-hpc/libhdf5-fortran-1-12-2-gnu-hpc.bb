SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran_1_12_2-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "93fdf21362a526df6491fac7dce073aa9957f06d7705ee4fb66c9cd70894a26e11937ff91a0809b033b6e2c50d79ad152e57275c5ed1230f7b184c1586917bd5"

RPROVIDES:${PN} += "libhdf5-fortran-1-12-2-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5"

inherit rpm
