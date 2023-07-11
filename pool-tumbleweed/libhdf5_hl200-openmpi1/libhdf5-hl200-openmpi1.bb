SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-openmpi1-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "09655dbc4cfc24a51201a6edfc3672fb55c0c6e29307629685d71ab8b1db3411f3c19d523fd8ce15515b23f6757ae9c09b2afa981217c273d491474b155a8b5a"

RPROVIDES:${PN} += "libhdf5-hl-openmpi1 \
libhdf5-hl.so.200 \
libhdf5-hl200-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200"

inherit rpm
