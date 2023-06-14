SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-openmpi1-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "bc2b358ca4a7f2beeb64cae8b2bf84d08b71ffe3e2de6f651ffc75ef76eea68578211b8bd2b4f075d27d39a9d83ca5d8696b77701550ff3b9f8ba7135e2d52c2"

RPROVIDES:${PN} += "libhdf5-fortran-openmpi1 \
libhdf5-fortran.so.200 \
libhdf5-fortran200-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.200 \
libmpi.so.12"

inherit rpm
