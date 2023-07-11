SUMMARY = "Password-based encryption utility using the scrypt key derivation function"
DESCRIPTION = "The scrypt key derivation function was originally developed for use in the \
Tarsnap online backup system and is designed to be far more secure against \
hardware brute-force attacks than alternative functions such as PBKDF2 or \
bcrypt."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "scrypt-1.3.1-1.12.aarch64.rpm"
RPM_HASH = "8baa9dced763cf9f706a4b7a35efa7d6fac143b12e415d256cfaea34baefc056e6910128d376011a9ec6b3e979e8278d0ef13b29cc795f76093c39a8736c0996"

RPROVIDES:${PN} += "scrypt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
