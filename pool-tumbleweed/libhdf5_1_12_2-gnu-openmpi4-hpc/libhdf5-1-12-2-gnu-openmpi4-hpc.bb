SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi4-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_1_12_2-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "2eee5a98682ad4f9d48f3473ed953bffa41c5800cc93bcb8ca5877d35c4dec6bfce0baf9c6723ab76b6b30e14bce18afadc8c9b99f6264ba01d18b320807f1d6"

RPROVIDES:${PN} += "libhdf5-1-12-2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi4-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
