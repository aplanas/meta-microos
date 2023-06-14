SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-openmpi1-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "09b07d8594bbb8f7262aad1fdcddae3c980f24c53591d1cabb5bbf7838b1bb70aa78b80daa984a074adf55cd0c1f75ddf24b292c3d55b1a273c62cf18cdde041"

RPROVIDES:${PN} += "libhdf5hl-fortran-openmpi1 \
libhdf5hl-fortran.so.200 \
libhdf5hl-fortran200-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-fortran.so.200 \
libhdf5-hl.so.200 \
libhdf5.so.200"

inherit rpm
