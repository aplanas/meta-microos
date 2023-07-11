SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi2 version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl200-openmpi2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "572e76bb016cd6a6f04aad2ab76964f302a94a5196db694b5ceb1c17aacd0cae7b76bcd42fb6182cea3aa11b3185bab806039fe07dc337f48837eeb7af703e20"

RPROVIDES:${PN} += "libhdf5-hl-openmpi2 \
libhdf5-hl.so.200 \
libhdf5-hl200-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.200"

inherit rpm
