SUMMARY = "Extended crypt library for DES, MD5, Blowfish and others"
DESCRIPTION = "libxcrypt is a modern library for one-way hashing of passwords.  It \
supports DES, MD5, SHA-2-256, SHA-2-512, and bcrypt-based password \
hashes, and provides the traditional Unix 'crypt' and 'crypt_r' \
interfaces, as well as a set of extended interfaces pioneered by \
Openwall Linux, 'crypt_rn', 'crypt_ra', 'crypt_gensalt', \
'crypt_gensalt_rn', and 'crypt_gensalt_ra'."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.36"

RPM_NAME = "libcrypt1-4.4.36-1.1.aarch64.rpm"
RPM_HASH = "a369ad3593e643b25ec422da2dc5c6579eb69807a964cb3daf5ddc565004f9fdc625853345adb689bab896f6affa759632218120b42b49d522a44a852f22ca5f"

RPROVIDES:${PN} += "libcrypt.so.1 \
libcrypt1 \
libowcrypt.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
