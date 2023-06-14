SUMMARY = "Hash-based predictive Lempel-Ziv compressor"
DESCRIPTION = "LZ4 is a lossless data compression algorithm that is focused on \
compression and decompression speed. It belongs to the LZ77 \
(Lempel–Ziv) family of byte-oriented compression schemes. It is a \
 \
This subpackage contains the (de)compressor code as a shared library."
LICENSE = "BSD-2-Clause"

PV = "1.9.4"

RPM_NAME = "liblz4-1-1.9.4-2.3.aarch64.rpm"
RPM_HASH = "de5ada4acb2f20274943e4b50b174b8ed52a9b9d07b93c8a81bcaaf8d2b8203a48ffb07bbe9fcea60dfe2eafc8f4f8a8e61d432470e46a2534bd98c66845922b"

RPROVIDES:${PN} += "liblz4-1 \
liblz4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
