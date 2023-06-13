SUMMARY = "Password-based encryption utility using the scrypt key derivation function"
DESCRIPTION = "The scrypt key derivation function was originally developed for use in the \
Tarsnap online backup system and is designed to be far more secure against \
hardware brute-force attacks than alternative functions such as PBKDF2 or \
bcrypt."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "scrypt-1.3.1-1.11.aarch64.rpm"
RPM_HASH = "969f372944b266cc4e45cc0b420283320e008312e0ab7a2db7fcc65c6774dfa8f902fe8f8091876c560ff628d7631ac9cd18c3394880cc77c2c77c26237226ab"

RPROVIDES:${PN} += "scrypt \
scrypt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
