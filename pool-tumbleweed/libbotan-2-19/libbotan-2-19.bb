SUMMARY = "A C++ Crypto Library"
DESCRIPTION = "Botan is a C++ library that provides support for many common \
cryptographic operations, including encryption, authentication, and \
X.509v3 certificates and CRLs. A wide variety of algorithms is \
supported, including RSA, DSA, DES, AES, MD5, and SHA-1."
LICENSE = "BSD-2-Clause"

PV = "2.19.3"

RPM_NAME = "libbotan-2-19-2.19.3-1.6.aarch64.rpm"
RPM_HASH = "da6449e2510998bd28c708e9dcf1476d8cadfa850c13d5674d089405ea68819c6848c4f8357c11947d7f5674987c09b7e5fd7405e8f8819e7498bed04092d3b3"

RPROVIDES:${PN} += "libbotan-2-19 \
libbotan-2.so.19"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
liblzma.so.5 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtspi.so.1 \
libz.so.1"

inherit rpm
