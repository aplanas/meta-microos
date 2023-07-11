SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.15.6"

RPM_NAME = "python310-pyzstd-0.15.6-2.1.aarch64.rpm"
RPM_HASH = "4cd6aa4047f1564b108913a2c4731e728850371c675e84bfbc024fd46a65aa445c7632e64b99a3c768a2b4cf498dfe9155594521f8435c20ffdfe386f9308208"

RPROVIDES:${PN} += "python3.10dist-pyzstd \
python310-pyzstd \
python3dist-pyzstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
