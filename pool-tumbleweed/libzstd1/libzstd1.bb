SUMMARY = "Zstd compression library"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
This subpackage contains the implementation as a shared library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "libzstd1-1.5.5-3.2.aarch64.rpm"
RPM_HASH = "fa7f4cbffa011b5596c6057e8b9b975861d46587f5e232b8986c3b5aad000c0e848a8c95eddb9192929ebed5f5ea7d6cd1c8dfcd827993c34bed66b60b213a0d"

RPROVIDES:${PN} += "libzstd.so.1 \
libzstd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
