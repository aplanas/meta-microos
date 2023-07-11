SUMMARY = "Keccak family hashing library, including SHA-3"
DESCRIPTION = "libkeccak is a bit-oriented lanewise implementation of the Keccak \
family with support for extend output size, state marshalling, \
algorithm tuning with implicit parameters, secure erasure of \
sensitive data, and HMAC. \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3)."
LICENSE = "ISC"

PV = "1.3.1.2"

RPM_NAME = "libkeccak1-1.3.1.2-2.4.aarch64.rpm"
RPM_HASH = "b3cff4e37744f90ed39981045b4dc51c9d83c1e8db5b82c671d5d6da6090950d0c791dfeb3fae33207a7eefcb761923263f8a28324cc7c44e770d9eeeb9f86cd"

RPROVIDES:${PN} += "libkeccak.so.1 \
libkeccak1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
