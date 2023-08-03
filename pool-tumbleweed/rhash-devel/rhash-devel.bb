SUMMARY = "Headers and Static Library for LibRHash"
DESCRIPTION = "LibRHash is a professional, portable, thread-safe C library for \
computing a wide variety of hash sums, such as CRC32, MD4, MD5, SHA1, \
SHA256, SHA512, AICH, ED2K, Tiger, DC++ TTH, BitTorrent BTIH, GOST R \
34.11-94, RIPEMD-160 HAS-160, EDON-R, Whirlpool and Snefru. \
Hash sums are used to ensure and verify integrity of large volumes of \
data for a long-term storing or transferring. \
 \
This package includes LibRHash development files."
LICENSE = "0BSD"

PV = "1.4.4"

RPM_NAME = "rhash-devel-1.4.4-1.1.aarch64.rpm"
RPM_HASH = "366d34e785f2becd6abb05f7b36c6299d18899121e121c0c307ecf978069430e4a2168736a488ef0e3090b6a09d05914d14f20a3380c1f0948fbbf93d3f0b8b3"

RPROVIDES:${PN} += "librhash-devel \
rhash-devel"

RDEPENDS:${PN} += "librhash1"

inherit rpm
