SUMMARY = "Extended crypt library for DES, MD5, Blowfish and others"
DESCRIPTION = "libxcrypt is a modern library for one-way hashing of passwords.  It \
supports DES, MD5, SHA-2-256, SHA-2-512, and bcrypt-based password \
hashes, and provides the traditional Unix 'crypt' and 'crypt_r' \
interfaces, as well as a set of extended interfaces pioneered by \
Openwall Linux, 'crypt_rn', 'crypt_ra', 'crypt_gensalt', \
'crypt_gensalt_rn', and 'crypt_gensalt_ra'."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.34"

RPM_NAME = "libcrypt1-4.4.34-1.1.aarch64.rpm"
RPM_HASH = "b66bdb256a01a3f07c37a510707e95981a3cc9a00396215b8dea98feefcfd1a8536950df80185f0e2d9682d925df70c4d56774ff6791903729de96269b2dc4eb"

RPROVIDES:${PN} += "libcrypt.so.1()(64bit) \
libcrypt.so.1(GLIBC_2.17)(64bit) \
libcrypt.so.1(OW_CRYPT_1.0)(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypt.so.1(XCRYPT_4.3)(64bit) \
libcrypt.so.1(XCRYPT_4.4)(64bit) \
libcrypt1 \
libcrypt1(aarch-64) \
libowcrypt.so.1()(64bit) \
libowcrypt.so.1(OW_CRYPT_1.0)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit)"

inherit rpm
