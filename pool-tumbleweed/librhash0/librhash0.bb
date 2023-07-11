SUMMARY = "LibRHash Shared Library"
DESCRIPTION = "LibRHash is a professional, portable, thread-safe C library for \
computing a wide variety of hash sums, such as CRC32, MD4, MD5, SHA1, \
SHA256, SHA512, AICH, ED2K, Tiger, DC++ TTH, BitTorrent BTIH, GOST R \
34.11-94, RIPEMD-160 HAS-160, EDON-R, Whirlpool and Snefru. \
Hash sums are used to ensure and verify integrity of large volumes of \
data for a long-term storing or transferring."
LICENSE = "0BSD"

PV = "1.4.3"

RPM_NAME = "librhash0-1.4.3-1.6.aarch64.rpm"
RPM_HASH = "1ef97707a62bb1b2ddbebe959ca2d27cb59e0fb909dc8e374a5c27a7a746c84f8fe0aa251c0983c691c9d62bb86721a54a0f31711251ac4ae42984661ad66ea0"

RPROVIDES:${PN} += "librhash.so.0 \
librhash0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
