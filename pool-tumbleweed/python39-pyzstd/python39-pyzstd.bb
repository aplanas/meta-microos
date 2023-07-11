SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.15.6"

RPM_NAME = "python39-pyzstd-0.15.6-2.1.aarch64.rpm"
RPM_HASH = "49036fcba207b130dba1fd02423acf7b307b0ec0157a1411097d030d8d90aa2840afa46a28ebe0fb8b90ef152df7f8b10d2fdefdea284ebdb4851e2bcecbca83"

RPROVIDES:${PN} += "python3.9dist-pyzstd \
python39-pyzstd \
python3dist-pyzstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
