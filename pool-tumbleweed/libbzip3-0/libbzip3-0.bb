SUMMARY = "Compressor with Burrows–Wheeler transform and PPM context modeling"
DESCRIPTION = "A compressor featuring improved compression ratios and performance \
over bzip2 thanks to a order-0 context mixing entropy coder, a \
Burrows-Wheeler transform code making use of suffix arrays, a RLE \
with Lempel Ziv+Prediction pass based on LZ77-style string matching \
and PPM-style context modeling."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "libbzip3-0-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "bbc684f5c5b556e9e5ff871ea27bc81dce509fc21b1d22600ec54a244b482ddbcfaaf844fd66e1194e67b8f0f1f54ef7d1faaf51d744bcebc93e270f2d733350"

RPROVIDES:${PN} += "libbzip3-0 \
libbzip3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
