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

RPM_NAME = "openssl-engine-libp11-0.4.12-3.1.aarch64.rpm"
RPM_HASH = "c815bab1cf1e88062ffd6e9cb0c8ef9ad87147a81498a23db25008e12955bfa09d4bbc2ce219996113b2e8fca8b55b79961036024c41d123bdd37d1fba52969d"

RPROVIDES:${PN} += "openssl-engine-libp11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
