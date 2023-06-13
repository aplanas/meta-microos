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

PV = "1.4.3"

RPM_NAME = "rhash-devel-1.4.3-1.5.aarch64.rpm"
RPM_HASH = "74709069a054165482e6e6d8f194252b827bd116fc51b3c27ba56f1c91c48206508273b5e6239f66cd1c9efad79ff5153ac6849d10d122da9e9dcb0c00faacda"

RPROVIDES:${PN} += "librhash-devel \
rhash-devel \
rhash-devel(aarch-64)"

RDEPENDS:${PN} += "librhash0"

inherit rpm
