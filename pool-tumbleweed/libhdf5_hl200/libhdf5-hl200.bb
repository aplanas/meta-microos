SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "9fa3288c0b6ac48ee606f9ce6edf48ca05d751336431f58035d4b31d9a0924a558787b9fc7ca2afbd2a543adb0df6b9570e95fb0ef5b91d2c91724c1c2b177d7"

RPROVIDES:${PN} += "libhdf5_hl \
libhdf5_hl.so.200()(64bit) \
libhdf5_hl200 \
libhdf5_hl200(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhdf5.so.200()(64bit)"

inherit rpm
