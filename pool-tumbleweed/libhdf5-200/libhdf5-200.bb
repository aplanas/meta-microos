SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "137acdf65fecd3c74d9caddef936de8e5007b9ab1bfb61f40fc790f2bb4e7f03ceb146607f6a3b4909ef492c6282a313b4ff20e35bd86bbdc5876e2bbccb169e"

RPROVIDES:${PN} += "libhdf5 \
libhdf5-200 \
libhdf5.so.200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
