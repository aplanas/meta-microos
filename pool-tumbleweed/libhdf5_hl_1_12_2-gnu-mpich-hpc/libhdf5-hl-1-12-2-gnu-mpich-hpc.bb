SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mpich-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_1_12_2-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "67b0feb1091692077718a9454c76767cae4faae80bd3e10a09c7f1d5afcdc35b64eaea2869c6442450d4a272a14ff55a503ee52ffaf436c06eb74c28ad4aa8f9"

RPROVIDES:${PN} += "libhdf5-hl-1-12-2-gnu-mpich-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-mpich-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
