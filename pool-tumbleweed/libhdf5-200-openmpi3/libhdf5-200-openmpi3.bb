SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi3 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-openmpi3-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "ad0bed9bdfd9cf3d76b7aa8fa7b7cc50ecf49a190d54d6c000677456c2a8c7f042f78fca214f67c2d141c39f03fb5a14c20187f6823fb91eedc8821cf646ec15"

RPROVIDES:${PN} += "libhdf5-200-openmpi3 \
libhdf5-openmpi3 \
libhdf5.so.200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
libz.so.1"

inherit rpm
