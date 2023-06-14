SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-mvapich2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "9983e243b751ddc407999b42e3350d797a096f5a792a9d8d9d7550b93ff77892a1730c7c8797ab22f697a91f75a9efdf48bd62c67d4ba3e066af115de239a3b8"

RPROVIDES:${PN} += "libhdf5-200-mvapich2 \
libhdf5-mvapich2 \
libhdf5.so.200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.12 \
libz.so.1"

inherit rpm
