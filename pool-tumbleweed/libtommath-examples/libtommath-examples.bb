SUMMARY = "Example files for LibTomMath"
DESCRIPTION = "Demo *.c files showing how to use TomMath library. \
 \
LibTomMath provides highly optimized and portable routines for a vast \
majority of integer based number theoretic applications (including public \
key cryptography). LibTomMath is not a cryptographic toolkit itself but it \
can be used to write one [Used in LibTomCrypt for RSA, DH and ECC public key \
routines]."
LICENSE = "Unlicense"

PV = "1.2.0"

RPM_NAME = "libtommath-examples-1.2.0-2.2.aarch64.rpm"
RPM_HASH = "a240479f6450c2375fc255627694ba0558f7f8d00b5556509d52c9b4a948988cf72fb48fdd6a137c045178db072939be0e83bc15caea24f3fe8e46c9c6d324d6"

RPROVIDES:${PN} += "libtommath-examples \
libtommath-examples(aarch-64) \
libtommath0-examples"

RDEPENDS:${PN} += ""

inherit rpm
