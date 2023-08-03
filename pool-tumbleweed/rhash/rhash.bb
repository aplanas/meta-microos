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

PV = "1.4.4"

RPM_NAME = "rhash-1.4.4-1.1.aarch64.rpm"
RPM_HASH = "e60eda50b5692ece7677233833212bf982169424b7ee6624cf69828702a2b8dd5d436c9b23297ab5b0dcea22d9eb800b13f836fe0c5e02dc565fe4cedcdf8854"

RPROVIDES:${PN} += "config-rhash \
rhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librhash.so.1"

inherit rpm
