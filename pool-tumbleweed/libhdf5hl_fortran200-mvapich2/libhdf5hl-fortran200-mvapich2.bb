SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-mvapich2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "b607da4da0662f8d9a3c517bbd59b6ef0f19c5da749dd01885ab3b1d31f4c700365bf367ec09abb6735488f4d6180af691cdfc5922b94e9384774197a5f334e9"

RPROVIDES:${PN} += "libhdf5hl-fortran-mvapich2 \
libhdf5hl-fortran.so.200 \
libhdf5hl-fortran200-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-fortran.so.200 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libmpi.so.12"

inherit rpm
