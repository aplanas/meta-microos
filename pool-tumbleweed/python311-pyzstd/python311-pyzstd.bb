SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.15.6"

RPM_NAME = "python311-pyzstd-0.15.6-2.1.aarch64.rpm"
RPM_HASH = "d5aeffbd2980ac8a88978f440887c3e36aa62cc27eb12314711a5208de271491dc696ad29d1ef63d590d0c4e107692a4bb599aaee7303593c14f2c9773ec44e5"

RPROVIDES:${PN} += "python3-pyzstd \
python3.11dist-pyzstd \
python311-pyzstd \
python3dist-pyzstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
