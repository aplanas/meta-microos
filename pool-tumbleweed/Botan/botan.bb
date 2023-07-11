SUMMARY = "A C++ Crypto Library"
DESCRIPTION = "Botan is a C++ library that provides support for many common \
cryptographic operations, including encryption, authentication, and \
X.509v3 certificates and CRLs. A wide variety of algorithms is \
supported, including RSA, DSA, DES, AES, MD5, and SHA-1."
LICENSE = "BSD-2-Clause"

PV = "2.19.3"

RPM_NAME = "Botan-2.19.3-1.6.aarch64.rpm"
RPM_HASH = "7fcb6c6b3b652d767bc659a21a88f594d4834284eed28267115cffa8432a4e60b59eca4c1c4ead1bcf2d89bcd2b416cbbf06d75c3af9b2fe9a2b53f21c58ba90"

RPROVIDES:${PN} += "Botan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbotan-2.so.19 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
