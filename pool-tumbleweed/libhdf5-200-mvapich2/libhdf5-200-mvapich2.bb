SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-mvapich2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "0e868f68f111a1850d3f42208b21ff6bda94f0dd01e49c2a48dab96c61af56467d30c6c917394c7f5957f1058da0f0f3467590624cd0772dc6b0f775c48bd20d"

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
