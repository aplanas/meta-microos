SUMMARY = "Zstandard compression tools"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm. Speed \
vs. compression trade-off is configurable in small increments. \
Decompression speed is preserved and remains roughly the same at all \
settings, a property shared by most LZ compression algorithms, such \
as zlib or lzma. \
 \
At roughly the same ratio, zstd (v1.4.0) achieves ~870% faster \
compression than gzip. For roughly the same time, zstd achives a \
~12% better ratio than gzip. LZMA outperforms zstd by ~10% faster \
compression for same ratio, or ~1–4% size reduction for same time."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "zstd-1.5.5-3.2.aarch64.rpm"
RPM_HASH = "4d2f5259c1401017f9477de0f6a778fdd81ddbfa47cdd46cef1388fc85f783e21e99f4e493b9e96463ee9abcbfc52fdfee4dcdff7a7ceb34dfc4e1d0eb6a8f12"

RPROVIDES:${PN} += "zstd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
