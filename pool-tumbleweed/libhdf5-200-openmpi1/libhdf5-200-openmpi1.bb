SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-openmpi1-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "8bc877934b356f23fd0235399f9c4476346a635fe3d1aa705ebffc3df0efa09653f50263e304bc0cd30e5ec745a5219403cfc6937538a1cf92ec20175c790270"

RPROVIDES:${PN} += "libhdf5-200-openmpi1 \
libhdf5-200-openmpi1(aarch-64) \
libhdf5-openmpi1 \
libhdf5.so.200()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libmpi.so.12()(64bit) \
libz.so.1()(64bit)"

inherit rpm
