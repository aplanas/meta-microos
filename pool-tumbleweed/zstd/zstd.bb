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

RPM_NAME = "zstd-1.5.5-3.1.aarch64.rpm"
RPM_HASH = "0cabcb6bcb6119123c6a0efed767dbaf4251ccc571c4d7b540eefdfde843e9a8b6e905a4fb2776ced8558089cbe741dc245ed747b6c0955a3301deed1acaf219"

RPROVIDES:${PN} += "zstd"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
