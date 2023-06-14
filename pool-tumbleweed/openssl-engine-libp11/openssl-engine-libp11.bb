SUMMARY = "Library Implementing a Small Layer on Top of PKCS#11 API"
DESCRIPTION = "Libp11 is a library implementing a small layer on top of PKCS#11 API to \
make using PKCS#11 implementations easier. \
 \
The official name for PKCS#11 is 'RSA Security Inc. PKCS #11 \
Cryptographic Token Interface (Cryptoki)'. \
 \
Libp11 source code includes the official header files (version 2.20) \
and thus is 'derived from the RSA Security Inc. PKCS #11 Cryptographic \
Token Interface (Cryptoki)'."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.12"

RPM_NAME = "openssl-engine-libp11-0.4.12-2.3.aarch64.rpm"
RPM_HASH = "2f70a62dd650c57a5b104e67492c7d24a44b39f5e1a774538bbde9cd62ca3d3b0b2a2991a40c6ed9b75686bb23345fcdc370d82e36aacc5487862e0656cce80a"

RPROVIDES:${PN} += "openssl-engine-libp11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
