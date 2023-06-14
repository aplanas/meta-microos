SUMMARY = "A C++ Crypto Library"
DESCRIPTION = "Botan is a C++ library that provides support for many common \
cryptographic operations, including encryption, authentication, and \
X.509v3 certificates and CRLs. A wide variety of algorithms is \
supported, including RSA, DSA, DES, AES, MD5, and SHA-1."
LICENSE = "BSD-2-Clause"

PV = "2.19.3"

RPM_NAME = "libbotan-2-19-2.19.3-1.4.aarch64.rpm"
RPM_HASH = "a8d6ab37d11f4abed6119f3ba2da9cf965bae5a2c1e1ed3f68eb9c62da6500482038abb6588352768f74d366f73f7fb74723d52367b8a98223af2683f0c33a2e"

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
