SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-mvapich2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "9b8fda8272924f1d91c7326762d019b919f78be9e679ad02d361216684268030979d2eb11d00bc09bd96cbee69b840f33453021003b4c0a92179dadfd01ede0f"

RPROVIDES:${PN} += "libhdf5_hl-mvapich2 \
libhdf5_hl.so.200()(64bit) \
libhdf5_hl200-mvapich2 \
libhdf5_hl200-mvapich2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhdf5.so.200()(64bit) \
libmpi.so.12()(64bit)"

inherit rpm
