SUMMARY = "LZMA Compression and Decompression Library"
DESCRIPTION = "The lzlib compression library provides in-memory LZMA compression and \
decompression functions, including integrity checking of the \
decompressed data. The compressed data format used by the library is \
the lzip format."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "liblz1-1.13-1.8.aarch64.rpm"
RPM_HASH = "e767071fada1bfc9df4c6136f1f4ed006109d1b60efb330be8e3b3cc09b241a5e0d18e7085430d7f219d7ce877635eecf001f1863edc7b63f53b5a00c2d15233"

RPROVIDES:${PN} += "liblz.so.1 \
liblz1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
