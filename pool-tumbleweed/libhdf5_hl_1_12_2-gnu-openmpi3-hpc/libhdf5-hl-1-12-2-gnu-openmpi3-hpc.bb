SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi3-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_1_12_2-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5330d84523d4863b8141469b9f6e09b4a7102d3e4b6ab2d60001f7f1fd9ae0ae09a789743cf0c58a42af10b00e6ff8e82eaae4f119dfcead886d1e7f1b16438c"

RPROVIDES:${PN} += "libhdf5-hl-1-12-2-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi3-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
