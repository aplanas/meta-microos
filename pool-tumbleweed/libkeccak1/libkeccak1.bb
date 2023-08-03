SUMMARY = "Keccak family hashing library, including SHA-3"
DESCRIPTION = "libkeccak is a bit-oriented lanewise implementation of the Keccak \
family with support for extend output size, state marshalling, \
algorithm tuning with implicit parameters, secure erasure of \
sensitive data, and HMAC. \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3)."
LICENSE = "ISC"

PV = "1.4"

RPM_NAME = "libkeccak1-1.4-1.1.aarch64.rpm"
RPM_HASH = "c0a5427632bba0d43d56ce52e13398b03d2a8cf673acba50eabedeaccac413204787ec20365a9db6b077aedd56b021644a6397ee7d4351dd96666da080dceeb0"

RPROVIDES:${PN} += "libkeccak.so.1 \
libkeccak1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
