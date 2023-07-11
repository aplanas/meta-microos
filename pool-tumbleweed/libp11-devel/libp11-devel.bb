SUMMARY = "Library Implementing a Small Layer on Top of PKCS#11 API"
DESCRIPTION = "Libp11 is a library implementing a small layer on top of PKCS#11 API to \
make using PKCS#11 implementations easier. \
 \
The official name for PKCS#11 is 'RSA Security Inc. PKCS #11 \
Cryptographic Token Interface (Cryptoki)'. \
 \
Libp11 source code include the official header files (version 2.20) and \
thus is 'derived from the RSA Security Inc. PKCS #11 Cryptographic \
Token Interface (Cryptoki)'."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.12"

RPM_NAME = "libp11-devel-0.4.12-3.1.aarch64.rpm"
RPM_HASH = "0e87b689189588c59cee6687b96db394d076520910f5d7383f1638d957641b62b5e83f117652a3c2570a42de3748fb2be7cf1d8938545244e04433b70d590718"

RPROVIDES:${PN} += "libp11-devel \
pkgconfig-libp11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libp11-3 \
openssl-devel"

inherit rpm
