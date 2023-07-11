SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi2-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_1_12_2-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "6cc26bea81ed77124bbd304609a8fad9c4ae47c3f08302f3521d0a47cca4f88e155cc266891251fa7502faeebc55a591bf6413e5a9abffef40c3cdc278b8ddb5"

RPROVIDES:${PN} += "libhdf5-hl-1-12-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
