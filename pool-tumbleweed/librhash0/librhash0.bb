SUMMARY = "LibRHash Shared Library"
DESCRIPTION = "LibRHash is a professional, portable, thread-safe C library for \
computing a wide variety of hash sums, such as CRC32, MD4, MD5, SHA1, \
SHA256, SHA512, AICH, ED2K, Tiger, DC++ TTH, BitTorrent BTIH, GOST R \
34.11-94, RIPEMD-160 HAS-160, EDON-R, Whirlpool and Snefru. \
Hash sums are used to ensure and verify integrity of large volumes of \
data for a long-term storing or transferring."
LICENSE = "0BSD"

PV = "1.4.3"

RPM_NAME = "librhash0-1.4.3-1.5.aarch64.rpm"
RPM_HASH = "291e73d3806da098386fd9ed266732f5f130507240561982f70668b04aa811f6ede07adf270aa1a362c88635e72b8ea38f6f0fa375ecc0e00cf6c62a4bfdbe51"

RPROVIDES:${PN} += "librhash.so.0 \
librhash0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
