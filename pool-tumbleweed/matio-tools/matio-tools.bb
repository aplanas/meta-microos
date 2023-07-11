SUMMARY = "Command line tools for matio"
DESCRIPTION = "matio is an open-source library for reading and writing MATLAB MAT files. \
This library is designed for use by programs/libraries that do not have \
access or do not want to rely on MATLAB's shared library."
LICENSE = "BSD-2-Clause"

PV = "1.5.23"

RPM_NAME = "matio-tools-1.5.23-2.3.aarch64.rpm"
RPM_HASH = "54b0fd9c6273115453e5dc1f85bc4899264a21f4e58aca9674768415c8c9b0279c9869e5195d3e032269c27cd29e0ed7cc9d2c02e313e947157df8dc547a77f3"

RPROVIDES:${PN} += "matio-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5 \
libm.so.6 \
libmatio.so.11 \
libmatio11"

inherit rpm
