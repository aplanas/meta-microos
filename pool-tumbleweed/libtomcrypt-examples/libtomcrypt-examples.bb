SUMMARY = "Example Files for LibTomCrypt"
DESCRIPTION = "LibTomCrypt is a fairly comprehensive, modular and portable cryptographic \
toolkit that provides developers with a vast array of well known published \
block ciphers, one-way hash functions, chaining modes, pseudo-random \
numbergenerators, public key cryptography and a plethora of other routines. \
 \
This package contains example *.c files showing how to use TomCrypt library."
LICENSE = "SUSE-Public-Domain"

PV = "1.18.2"

RPM_NAME = "libtomcrypt-examples-1.18.2-3.2.aarch64.rpm"
RPM_HASH = "c0b9a7a4d42645d629a0dc566fa8abb23ceb17f1caf2b1623962577a648ec326be43dff9d722f536352a82844ea165b83ac49adcaf5e4f4083615e56498487c5"

RPROVIDES:${PN} += "libtomcrypt-examples"

RDEPENDS:${PN} += "libtomcrypt-devel"

inherit rpm
