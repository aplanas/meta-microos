SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-openmpi4-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ab36ebdad098db05800ce04fdde41ae7d78b12fb2f5da55c4a3f30151267f046dab18580688544209c6a71fe8f7009001dec0053dbe2e92995c8a96b7677f667"

RPROVIDES:${PN} += "libhdf5_hl-openmpi4 \
libhdf5_hl.so.200()(64bit) \
libhdf5_hl200-openmpi4 \
libhdf5_hl200-openmpi4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhdf5.so.200()(64bit)"

inherit rpm
