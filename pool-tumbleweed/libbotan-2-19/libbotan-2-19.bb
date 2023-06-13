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
libbotan-2-19(aarch-64) \
libbotan-2.so.19()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtspi.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
