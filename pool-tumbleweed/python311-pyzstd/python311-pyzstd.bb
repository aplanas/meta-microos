SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.15.6"

RPM_NAME = "python311-pyzstd-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "1b1bee10be13848959d9ab4ed8700c2ad130e23a4cdec1e36f66fba6622c838569be7b206c52985520b8f08dd7eec1620cc6d63078d9e72f22dbc15279557440"

RPROVIDES:${PN} += "python3.11dist(pyzstd) \
python311-pyzstd \
python311-pyzstd(aarch-64) \
python3dist(pyzstd)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libzstd.so.1()(64bit) \
python(abi)"

inherit rpm
