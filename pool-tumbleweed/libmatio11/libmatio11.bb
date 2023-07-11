SUMMARY = "Library for reading and writing MATLAB MAT files"
DESCRIPTION = "matio is an open-source library for reading and writing MATLAB MAT files. \
This library is designed for use by programs/libraries that do not have \
access or do not want to rely on MATLAB's shared library."
LICENSE = "BSD-2-Clause"

PV = "1.5.23"

RPM_NAME = "libmatio11-1.5.23-2.3.aarch64.rpm"
RPM_HASH = "7cc38cfe4bfb45ab3d3c68155a9cd732e213c75205291ff65b2431bb0a725fbe5a4cf6b8887b657c85ec03c081b99fc1df9608481c1a0ac4d6e74457e0b6e2c2"

RPROVIDES:${PN} += "libmatio.so.11 \
libmatio11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5 \
libhdf5.so.200 \
libz.so.1"

inherit rpm
