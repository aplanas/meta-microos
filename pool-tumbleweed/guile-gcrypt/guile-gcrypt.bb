SUMMARY = "Cryptography library for Guile using Libgcrypt"
DESCRIPTION = "Guile-Gcrypt provides a Guile 2.x interface to a subset of the GNU \
Libgcrypt crytographic library. It provides modules for cryptographic \
hash functions, message authentication codes (MAC), public-key cryptography, \
strong randomness, and more. It is implemented using the foreign function \
interface (FFI) of Guile."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "guile-gcrypt-0.4.0-1.3.aarch64.rpm"
RPM_HASH = "c8032d0de5de6b0b1bd38b2c1ba49a0f693384c255bda70387c36a28ff5a7205e260616f9385b365c24eb3b53f6bd19aa6c40601aa2a92040b99e92bb22140a8"

RPROVIDES:${PN} += "guile-gcrypt"

RDEPENDS:${PN} += "/usr/bin/sh \
guile \
libgcrypt-devel"

inherit rpm
