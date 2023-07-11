SUMMARY = "Development files for LibTomMath"
DESCRIPTION = "Headers and other development files for TomMath library. \
 \
LibTomMath provides highly optimized and portable routines for a vast \
majority of integer based number theoretic applications (including public \
key cryptography). LibTomMath is not a cryptographic toolkit itself but it \
can be used to write one [Used in LibTomCrypt for RSA, DH and ECC public key \
routines]."
LICENSE = "Unlicense"

PV = "1.2.0"

RPM_NAME = "libtommath-devel-1.2.0-3.1.aarch64.rpm"
RPM_HASH = "652c11737414161f44da7950787eb55caf1a9bb7ccd2cb60b3e09c4624cab9ca56e6420ed99a33ff6dab99ab516d6e1067af5d30e26c8015c257849c6192246e"

RPROVIDES:${PN} += "libtommath-devel \
libtommath0-devel \
pkgconfig-libtommath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtommath1"

inherit rpm
