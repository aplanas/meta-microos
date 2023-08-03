SUMMARY = "LibRHash Shared Library"
DESCRIPTION = "LibRHash is a professional, portable, thread-safe C library for \
computing a wide variety of hash sums, such as CRC32, MD4, MD5, SHA1, \
SHA256, SHA512, AICH, ED2K, Tiger, DC++ TTH, BitTorrent BTIH, GOST R \
34.11-94, RIPEMD-160 HAS-160, EDON-R, Whirlpool and Snefru. \
Hash sums are used to ensure and verify integrity of large volumes of \
data for a long-term storing or transferring."
LICENSE = "0BSD"

PV = "1.4.4"

RPM_NAME = "librhash1-1.4.4-1.1.aarch64.rpm"
RPM_HASH = "3f7f92d9c6646e6d73fb7a687451e346ba623134dc9252b5c74d8abe7d9047093e4b1d6c5f98f064f56ed9e2a47c8ceb8450f1f78b93463a117704eee302373f"

RPROVIDES:${PN} += "librhash.so.1 \
librhash1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
