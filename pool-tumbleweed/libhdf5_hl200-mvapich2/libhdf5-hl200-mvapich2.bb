SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-mvapich2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "18ed0bd6ca46ff0fec3c2668706af8b49e439ffed6c0577e03d37b9705f031ac5ba01513c6f161ebccf30be72e1613627636f8499af684c90518ae03a594f3f6"

RPROVIDES:${PN} += "libhdf5-hl-mvapich2 \
libhdf5-hl.so.200 \
libhdf5-hl200-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200 \
libmpi.so.12"

inherit rpm
