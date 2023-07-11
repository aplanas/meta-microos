SUMMARY = "Development Files for LibTomCrypt"
DESCRIPTION = "LibTomCrypt is a fairly comprehensive, modular and portable cryptographic \
toolkit that provides developers with a vast array of well known published \
block ciphers, one-way hash functions, chaining modes, pseudo-random \
numbergenerators, public key cryptography and a plethora of other routines. \
 \
This package contains headers and other development files."
LICENSE = "SUSE-Public-Domain"

PV = "1.18.2"

RPM_NAME = "libtomcrypt-devel-1.18.2-3.2.aarch64.rpm"
RPM_HASH = "1ba05225aeea103e75265780d77b1e63adc40dfc75439cc42c14e552c5ec85a389cfcaa2219678d43dbd86a45562e2bdcf98a37312927649f4dae67bd5e1e606"

RPROVIDES:${PN} += "libtomcrypt-devel \
pkgconfig-libtomcrypt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtomcrypt1"

inherit rpm
