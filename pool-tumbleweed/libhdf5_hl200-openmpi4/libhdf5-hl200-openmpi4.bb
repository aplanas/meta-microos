SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-openmpi4-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "aec974646d65e13691343784df98a4acde98987008a576269adbb33acd0fac0af3d83944a1aa368770315a58919d131f65560218f79f39d3ddd08e374bba7742"

RPROVIDES:${PN} += "libhdf5-hl-openmpi4 \
libhdf5-hl.so.200 \
libhdf5-hl200-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200"

inherit rpm
