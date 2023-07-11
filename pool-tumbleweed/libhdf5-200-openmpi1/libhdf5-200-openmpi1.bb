SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-openmpi1-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "42b1e29b46bd843317af2ca30c445d03e9a2359dc9ef33d0ca92c56b832c52de3a57d7cb4babaf2611fcf2df7511a0c145b7bb9fa4fbc4071d5dcd98a63beb18"

RPROVIDES:${PN} += "libhdf5-200-openmpi1 \
libhdf5-openmpi1 \
libhdf5.so.200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libz.so.1"

inherit rpm
