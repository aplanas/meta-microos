SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-openmpi4-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "f7b116e22fc9290255b818e1b9774fe33eef332c8b3b8df18e3bf6a447443bed66439bc0ad1a955f63122b13eb9e07a85e02d6a6e5d26acaf14c6541c0d58144"

RPROVIDES:${PN} += "libhdf5hl-fortran-openmpi4 \
libhdf5hl-fortran.so.200 \
libhdf5hl-fortran200-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libhdf5-fortran.so.200 \
libhdf5-hl.so.200 \
libhdf5.so.200"

inherit rpm
