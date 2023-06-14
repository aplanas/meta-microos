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

RPM_NAME = "lz4-1.9.4-2.3.aarch64.rpm"
RPM_HASH = "6e0d1a137e11fa20b6f2fd3e8a7f00ce98ba82be30479816918c1f3f127306e13c69275786a638c2de8dfeb2de1ba6ec6ea6fe47c709f44f23a30990ad991993"

RPROVIDES:${PN} += "lz4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
