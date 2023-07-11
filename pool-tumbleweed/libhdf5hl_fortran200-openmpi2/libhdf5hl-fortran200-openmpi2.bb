SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi2 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-openmpi2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "8f6d66b6971efb2f582f2fe10d2758c0ec7dbcc1636e95692cbc8e89637e011576071ec09c3a15cd9328809989abfc5fdbc48f32e95c8d951fde227135a04ca6"

RPROVIDES:${PN} += "libhdf5hl-fortran-openmpi2 \
libhdf5hl-fortran.so.200 \
libhdf5hl-fortran200-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-fortran.so.200 \
libhdf5-hl.so.200 \
libhdf5.so.200"

inherit rpm
