SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.15.9"

RPM_NAME = "python310-pyzstd-0.15.9-1.1.aarch64.rpm"
RPM_HASH = "9adb2c6980ad9394b8f31c6d1282df29d0fb45e62a45c871c4b52c69a3257ea61bab2e76613e9a3121649f40f7ef02361405813305332b99d5c6c4e2f3df373b"

RPROVIDES:${PN} += "python3.10dist-pyzstd \
python310-pyzstd \
python3dist-pyzstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
