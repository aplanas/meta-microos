SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.15.9"

RPM_NAME = "python39-pyzstd-0.15.9-1.1.aarch64.rpm"
RPM_HASH = "f045bec16886bc6f7488a7c53001281a44dd551ec781103fcf8d0584eb916c130415546b423b837667573d248e4bc18629faa63b97720ad1cbf482335786030c"

RPROVIDES:${PN} += "python3.9dist-pyzstd \
python39-pyzstd \
python3dist-pyzstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
