SUMMARY = "Library for DEFLATE/zlib/gzip compression and decompression"
DESCRIPTION = "libdeflate is a library for whole-buffer DEFLATE-based compression \
and decompression. It supports raw, zlib-wrapped and gzip-wrapped DEFLATE. \
It is significantly faster than the zlib library: \
 \
 - decompression speedup over gzip-1.10 is 2.28x (generic), 2.87x (AVX2) \
 - compression speedup over gzip is 1.72x (generic), 2.23x (AVX2) \
 \
In addition, libdeflate provides optional high compression modes \
above zlib's 'level 9'."
LICENSE = "BSD-2-Clause"

PV = "1.18"

RPM_NAME = "libdeflate0-1.18-1.1.aarch64.rpm"
RPM_HASH = "53233b3cf47fbbdfeb37047ffab54ff31a92180ecdf444b8fcfb3fb720da31b6c7bef023f0605fe7a66e23edb5a14806f401b01c8bd750a9b6ea8d439f96242e"

RPROVIDES:${PN} += "libdeflate.so.0 \
libdeflate0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
