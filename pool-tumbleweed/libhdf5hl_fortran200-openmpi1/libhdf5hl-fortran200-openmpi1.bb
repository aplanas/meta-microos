SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran200-openmpi1-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "dd5be7728cad505c57509b2c2ca0b71d26f31104d5183f87a9e95e2d90b761fc95c39f2f89f51d6f1dbd7323943726f1e282acee2b4d45c9c8976f0f7dd7af1b"

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
