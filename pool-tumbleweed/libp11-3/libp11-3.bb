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

RPM_NAME = "libp11-3-0.4.12-3.1.aarch64.rpm"
RPM_HASH = "6fffb4ec416ebbde10f721a7091df4319f5ceed4b6a4d3b28af58c210b29e3f516ead2ffa2d30060be50a19e057075c14c8dd8404e5f1c7598941e21352d935f"

RPROVIDES:${PN} += "libp11-3 \
libp11.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
