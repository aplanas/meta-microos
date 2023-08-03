SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.15.9"

RPM_NAME = "python311-pyzstd-0.15.9-1.1.aarch64.rpm"
RPM_HASH = "a0c6c5aa7861289532cc4b9b71a17747caf78af7a964e7368a1d2aa7a63e8e00c324c479976a74e9b717a6570c1ee8adf6143347f14dddbfdae0c333a811f096"

RPROVIDES:${PN} += "python3-pyzstd \
python3.11dist-pyzstd \
python311-pyzstd \
python3dist-pyzstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
