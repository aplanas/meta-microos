SUMMARY = "Cryptographic toolkit with ciphers, hashes, PRNG and PKI"
DESCRIPTION = "LibTomCrypt is a fairly comprehensive, modular and portable cryptographic \
toolkit that provides developers with a vast array of well known published \
block ciphers, one-way hash functions, chaining modes, pseudo-random \
numbergenerators, public key cryptography and a plethora of other routines. \
 \
This package contains shared libraries"
LICENSE = "SUSE-Public-Domain"

PV = "1.18.2"

RPM_NAME = "libtomcrypt1-1.18.2-3.2.aarch64.rpm"
RPM_HASH = "e888bc47decd5038163b89e05e3841313d648e076682416bf7035c23fa5f3f4df05087d180ba992b06ff9c5ffd504778539007c56c4086a586091f147b8553cf"

RPROVIDES:${PN} += "libtomcrypt.so.1 \
libtomcrypt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtommath.so.1"

inherit rpm
