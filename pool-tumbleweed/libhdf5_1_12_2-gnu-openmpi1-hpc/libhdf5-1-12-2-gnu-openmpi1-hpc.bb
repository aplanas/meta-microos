SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_1_12_2-gnu-openmpi1-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ee75f2b69d5d1015b257d818bdcedf2dff30468570ee2b320cef4c48110d2501fad9854bc680853d5308f1bf54bd91723ec120932552fad4c4cb022a1d3078d0"

RPROVIDES:${PN} += "libhdf5-1-12-2-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi1-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
