SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi2 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-openmpi2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "e2ae34a2935b06eec2a8fecac6d263f4b6074ceb2f967eb549ddbcef5d10c80a1c9509baa08abb13d0dc8aed8870b88535731a521a82230cc28102fbd567c8a6"

RPROVIDES:${PN} += "libhdf5-200-openmpi2 \
libhdf5-openmpi2 \
libhdf5.so.200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.20 \
libz.so.1"

inherit rpm
