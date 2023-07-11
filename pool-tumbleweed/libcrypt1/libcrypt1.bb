SUMMARY = "Extended crypt library for DES, MD5, Blowfish and others"
DESCRIPTION = "libxcrypt is a modern library for one-way hashing of passwords.  It \
supports DES, MD5, SHA-2-256, SHA-2-512, and bcrypt-based password \
hashes, and provides the traditional Unix 'crypt' and 'crypt_r' \
interfaces, as well as a set of extended interfaces pioneered by \
Openwall Linux, 'crypt_rn', 'crypt_ra', 'crypt_gensalt', \
'crypt_gensalt_rn', and 'crypt_gensalt_ra'."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.35"

RPM_NAME = "libcrypt1-4.4.35-1.1.aarch64.rpm"
RPM_HASH = "a842cde0a2da63b95ddeff3655a0261a1a14226fa777b48784e91db92c9da3953a0e2300ce986e58d68c523b5f86c479b1223f537479c7c71a1f87adddff76cf"

RPROVIDES:${PN} += "libcrypt.so.1 \
libcrypt1 \
libowcrypt.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
