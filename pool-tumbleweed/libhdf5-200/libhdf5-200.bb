SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "b6f58a4a8494349573aecb9099d754ccb9bcd11d7d8f1fc84e7ae8da3e0e43675601703526b5848aae27c7f0d00ac143ceafc852f1001ba944f2e1d55722d5b6"

RPROVIDES:${PN} += "libhdf5 \
libhdf5-200 \
libhdf5-200(aarch-64) \
libhdf5.so.200()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libz.so.1()(64bit)"

inherit rpm