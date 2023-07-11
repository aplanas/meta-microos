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

RPM_NAME = "rhash-devel-1.4.3-1.6.aarch64.rpm"
RPM_HASH = "f65466a67c88429d970dfe11a9d7f5146f8e1438c4d89135d712616fb727e444296e22d78172ad80d528bc03d952d238d67c0c59e9abdc479fec86a8d103aa85"

RPROVIDES:${PN} += "librhash-devel \
rhash-devel"

RDEPENDS:${PN} += "librhash0"

inherit rpm
