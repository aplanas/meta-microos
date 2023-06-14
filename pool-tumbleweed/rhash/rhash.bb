SUMMARY = "Recursive Hasher"
DESCRIPTION = "RHash (Recurcive Hasher) is a console utility for computing and \
verifying magnet links and hash sums of files. \
It supports CRC32, MD4, MD5, SHA1/SHA2, Tiger, DC++ TTH, BitTorrent \
BTIH, AICH, eDonkey hash, GOST R 34.11-94, RIPEMD-160, HAS-160, EDON-R, \
Whirlpool and Snefru hash algorithms. Hash sums are used to ensure and \
verify integrity of large volumes of data for a long-term storing or \
transferring. \
 \
Program features: \
 * Calculation of Magnet links and EDonkey 2000 links. \
 * Output in a predefined (SFV, BSD-like) or a user-defined format. \
 * Updating crc files (adding hash sums of files missing in the crc \
   file). \
 * Ability to process directories recursively."
LICENSE = "0BSD"

PV = "1.4.3"

RPM_NAME = "rhash-1.4.3-1.5.aarch64.rpm"
RPM_HASH = "862002cb2a5f77e08fd5cbda2f3e43821a38de063ad44207283f273fdd5642abb42a72356d9861de096a526b1c84ab39565d49d46ab3d9e254ffa5bcbb450294"

RPROVIDES:${PN} += "config-rhash \
rhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librhash.so.0"

inherit rpm
