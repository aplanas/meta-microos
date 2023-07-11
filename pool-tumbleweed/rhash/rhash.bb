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

RPM_NAME = "rhash-1.4.3-1.6.aarch64.rpm"
RPM_HASH = "e61d8a915f9be6ee91a59260f016ebf0647918235d528c1cb948b1bbf3efe3889e274545c3a5c3db96f67e597d00e5036bb5519e614af820014c88b977beb92b"

RPROVIDES:${PN} += "config-rhash \
rhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librhash.so.0"

inherit rpm
