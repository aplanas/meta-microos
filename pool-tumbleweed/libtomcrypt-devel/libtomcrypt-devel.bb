SUMMARY = "Development Files for LibTomCrypt"
DESCRIPTION = "LibTomCrypt is a fairly comprehensive, modular and portable cryptographic \
toolkit that provides developers with a vast array of well known published \
block ciphers, one-way hash functions, chaining modes, pseudo-random \
numbergenerators, public key cryptography and a plethora of other routines. \
 \
This package contains headers and other development files."
LICENSE = "SUSE-Public-Domain"

PV = "1.18.2"

RPM_NAME = "libtomcrypt-devel-1.18.2-3.1.aarch64.rpm"
RPM_HASH = "2adf4dfd0c297fb3a9d58af6d9a743501331ee18812ad537d635aa1b581c4d15ca532c84f6237119373a6cb0d3c1aac9fa8abd398b68f0ba7af00a95d16b5af7"

RPROVIDES:${PN} += "libtomcrypt-devel \
libtomcrypt-devel(aarch-64) \
pkgconfig(libtomcrypt)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtomcrypt1"

inherit rpm
