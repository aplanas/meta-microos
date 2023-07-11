SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi2 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-openmpi2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "8fd9fc310389daf6c6a4bfff9d312506dbd71d6ea77c0422344a1dc45639d956b0eeb0cd287cbb28ec62cb13ac77206e6e02e0f58bc839e13b0e609aa706777a"

RPROVIDES:${PN} += "libhdf5-fortran-openmpi2 \
libhdf5-fortran.so.200 \
libhdf5-fortran200-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.200 \
libmpi.so.20"

inherit rpm
