SUMMARY = "LZMA Compression and Decompression Library"
DESCRIPTION = "The lzlib compression library provides in-memory LZMA compression and \
decompression functions, including integrity checking of the \
decompressed data. The compressed data format used by the library is \
the lzip format."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "liblz1-1.13-1.7.aarch64.rpm"
RPM_HASH = "8b499c67f6e4bcaaf98345bde810d1dd8efd01c0ad6d6a64f41519a077f0f7bc3cf6ec010d9c4df006e6a03dcfb8452cde967fd83dff982bc2b7115946c52712"

RPROVIDES:${PN} += "liblz.so.1()(64bit) \
liblz1 \
liblz1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
