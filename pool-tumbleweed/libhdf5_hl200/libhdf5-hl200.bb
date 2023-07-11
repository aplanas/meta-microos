SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the serial version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "6b93c3b1fa88eca7ebe38add7bd6bdbbb79ed34a233b861d88294873370481db8a4f82f8d739944200882db5c30bae9b440239459e3c006943a7a128919d97d5"

RPROVIDES:${PN} += "libhdf5-hl \
libhdf5-hl.so.200 \
libhdf5-hl200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200"

inherit rpm
