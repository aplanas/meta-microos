SUMMARY = "Keccak family hashing library, including SHA-3"
DESCRIPTION = "libkeccak is a bit-oriented lanewise implementation of the Keccak \
family with support for extend output size, state marshalling, \
algorithm tuning with implicit parameters, secure erasure of \
sensitive data, and HMAC. \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3)."
LICENSE = "ISC"

PV = "1.3.1.2"

RPM_NAME = "libkeccak1-1.3.1.2-2.3.aarch64.rpm"
RPM_HASH = "899a3cd9eab2309813a15969ee2368d1b072173f51440e24044db052b1616f19562fbcccef1d1ac1445242f1d4c00d2d9d852949c25357d22cc8d16712a658a3"

RPROVIDES:${PN} += "libkeccak.so.1 \
libkeccak1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
