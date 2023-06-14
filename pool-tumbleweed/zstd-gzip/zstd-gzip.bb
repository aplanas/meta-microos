SUMMARY = "zstd and zlib based gzip drop-in"
DESCRIPTION = "Zstd, short for Zstandard, is a lossless compression algorithm, \
targeting faster compression than zlib at comparable ratios. \
 \
This subpackage provides a compatible alternative to gzip(1) using \
an optimized deflate/zlib handling."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "zstd-gzip-1.5.5-3.1.aarch64.rpm"
RPM_HASH = "cd8fa80713dfbb1c788f0838903d9d944c4ab95496acb84172fc6a7b46c7a1b5f73846a23f3245ed6a2ab1207cf37cfef3683a6c965fd501c39d81782e31358b"

RPROVIDES:${PN} += "alternative-gzip \
gzip \
zstd-gzip"

RDEPENDS:${PN} += "zstd"

inherit rpm
