SUMMARY = "Hash-based Predictive Lempel–Ziv compressor"
DESCRIPTION = "LZ4 is a lossless data compression algorithm that is focused on \
compression and decompression speed. It belongs to the LZ77 \
(Lempel–Ziv) family of byte-oriented compression schemes. It is a \
LZP2 fork and provides better compression ratio for text files. \
 \
This subpackage provides a GPL command-line utility to make use of \
the LZ4 algorithm."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later"

PV = "1.9.4"

RPM_NAME = "lz4-1.9.4-2.4.aarch64.rpm"
RPM_HASH = "ae3034ed78b7de70d0a1c3c9a139d89a33af4edf94aa72f72d6118438adccfd0a22b4348a272f9d96815dd8281c3155e32a120c997a56cc6660447e07942184e"

RPROVIDES:${PN} += "lz4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
