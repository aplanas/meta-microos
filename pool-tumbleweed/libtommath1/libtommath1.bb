SUMMARY = "Routines For a Integer Based Number Theoretic Applications"
DESCRIPTION = "LibTomMath provides highly optimized and portable routines for a vast \
majority of integer based number theoretic applications (including public \
key cryptography). LibTomMath is not a cryptographic toolkit itself but it \
can be used to write one [Used in LibTomCrypt for RSA, DH and ECC public key \
routines]."
LICENSE = "Unlicense"

PV = "1.2.0"

RPM_NAME = "libtommath1-1.2.0-3.1.aarch64.rpm"
RPM_HASH = "8975651b35228ed539f7b1a908b9034bd0414598559aae541b2911c3080a2330a79bd546034102a52c0e6765b0fbe44a17ee6c5d50a98fda75f13c11f07da3cd"

RPROVIDES:${PN} += "libtommath.so.1 \
libtommath1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
