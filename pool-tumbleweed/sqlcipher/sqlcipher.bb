SUMMARY = "SQLite database encryption"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development."
LICENSE = "BSD-3-Clause"

PV = "4.5.4"

RPM_NAME = "sqlcipher-4.5.4-1.1.aarch64.rpm"
RPM_HASH = "aab35202bce59124fd0d4ffb71740643b4781d3d8aa69396bbff6defc2c7085060a0244f3e703e20a4da274d9bb5063f0a1c11e1bd0cfc02516f196d792d9b13"

RPROVIDES:${PN} += "sqlcipher \
sqlcipher(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libreadline.so.8()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
