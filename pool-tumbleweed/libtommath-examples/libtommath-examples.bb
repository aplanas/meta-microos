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

RPM_NAME = "libtommath-examples-1.2.0-3.1.noarch.rpm"
RPM_HASH = "54c4ce1c50e77fb536aa4809c1fd1696f01fa7cada5d97badd5bab04910a8b82420f05545115dab9cf3256c6db2e234b073945bff1c56ef7f818b2843e022f99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtommath-examples \
libtommath0-examples"

RDEPENDS:${PN} += ""

inherit rpm
