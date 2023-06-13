SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-openmpi4-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "260509ff052cf2891e7fbc78fb985d94485586b90b5c41a62da3f68c694749b3b770a5ff67cededefae7235d93e025ce0cbe4335dec193145f8bd9eeb4dfe554"

RPROVIDES:${PN} += "libhdf5-200-openmpi4 \
libhdf5-200-openmpi4(aarch-64) \
libhdf5-openmpi4 \
libhdf5.so.200()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libmpi.so.40()(64bit) \
libz.so.1()(64bit)"

inherit rpm
