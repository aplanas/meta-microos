SUMMARY = "Hash-based predictive Lempel-Ziv compressor"
DESCRIPTION = "LZ4 is a lossless data compression algorithm that is focused on \
compression and decompression speed. It belongs to the LZ77 \
(Lempel–Ziv) family of byte-oriented compression schemes. It is a \
 \
This subpackage contains the (de)compressor code as a shared library."
LICENSE = "BSD-2-Clause"

PV = "1.9.4"

RPM_NAME = "liblz4-1-1.9.4-2.4.aarch64.rpm"
RPM_HASH = "86564515250dca1262a76bed163f8329b01926bef9fa07d0d0dcf6d5b66ed16eff877c1a9690814c3856a45843b8bb77c923c20a3faca946246549b5c5d6d62e"

RPROVIDES:${PN} += "liblz4-1 \
liblz4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
