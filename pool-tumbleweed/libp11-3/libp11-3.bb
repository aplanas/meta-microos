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

RPM_NAME = "libp11-3-0.4.12-2.3.aarch64.rpm"
RPM_HASH = "a89e71938956a4ffc1e5a78a60bc8adb7bb38dacfe5c3f8b5543419c38475d4ac0c1c77508c4af1693facc31f7ea76b7ea3c7aa131ce61f579a1bc299be97f53"

RPROVIDES:${PN} += "libp11-3 \
libp11.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
