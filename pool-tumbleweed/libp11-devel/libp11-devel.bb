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

RPM_NAME = "libp11-devel-0.4.12-2.3.aarch64.rpm"
RPM_HASH = "c959dae4b6a09924561b098b1b146b399448cd0b68067ec91832513c3d83bd49b008deeb19c2d64f4e7623beccec5b8c0c3d64d428df16b6913c1c33b3fb1706"

RPROVIDES:${PN} += "libp11-devel \
pkgconfig-libp11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libp11-3 \
openssl-devel"

inherit rpm
