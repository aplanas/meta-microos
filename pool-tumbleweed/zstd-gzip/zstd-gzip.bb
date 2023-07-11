SUMMARY = "zstd and zlib based gzip drop-in"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
This subpackage provides a compatible alternative to gzip(1) using \
an optimized deflate/zlib handling."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "zstd-gzip-1.5.5-3.2.aarch64.rpm"
RPM_HASH = "bfeb7d76b402cacffd3771dd953cbed32a1f53042f3c6d44e2910b9287d23c2a09e863a51981904077edda4e679cbcdb1dff2e7439654963e1a61dfbdcc30a9d"

RPROVIDES:${PN} += "alternative-gzip \
gzip \
zstd-gzip"

RDEPENDS:${PN} += "zstd"

inherit rpm
