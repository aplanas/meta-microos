SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230202"

RPM_NAME = "python310-libfwps-20230202-1.7.aarch64.rpm"
RPM_HASH = "aaa2abf8fbcac307c0c134d5f6a2a86a3baa7530a033a0951044829902e15e7020c9e50fe9d0c9456b43a6b7fba669d3332cdac2e2123ca2bcacd2284398526a"

RPROVIDES:${PN} += "python310-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
python-abi"

inherit rpm
