SUMMARY = "Cryptographic toolkit with ciphers, hashes, PRNG and PKI"
DESCRIPTION = "LibTomCrypt is a fairly comprehensive, modular and portable cryptographic \
toolkit that provides developers with a vast array of well known published \
block ciphers, one-way hash functions, chaining modes, pseudo-random \
numbergenerators, public key cryptography and a plethora of other routines. \
 \
This package contains shared libraries"
LICENSE = "SUSE-Public-Domain"

PV = "1.18.2"

RPM_NAME = "libtomcrypt1-1.18.2-3.1.aarch64.rpm"
RPM_HASH = "6e3a642e541a38e76cb9dd906ed55adfee6354dd23ac5c53c7d6c52c02ebb0e9fff78a7a7e9d4276c2bb25bdc54bd5ef7c5c78a5f93f7c551c47976b816f2023"

RPROVIDES:${PN} += "libtomcrypt.so.1 \
libtomcrypt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtommath.so.1"

inherit rpm
