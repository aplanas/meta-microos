SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_1_12_2-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "2c9bbb8c4feda52d7f2d99a75af49057799f774693d5835d7f05afe3ddb0886b77df955905c53ae59d0cd3e3eb100afc2a36273a7203d7bb36a337dcb7485dc3"

RPROVIDES:${PN} += "libhdf5-1-12-2-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
