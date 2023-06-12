SUMMARY = "A C++ Crypto Library"
DESCRIPTION = "Botan is a C++ library that provides support for many common \
cryptographic operations, including encryption, authentication, and \
X.509v3 certificates and CRLs. A wide variety of algorithms is \
supported, including RSA, DSA, DES, AES, MD5, and SHA-1."
LICENSE = "BSD-2-Clause"

PV = "2.19.3"

RPM_NAME = "Botan-2.19.3-1.4.aarch64.rpm"
RPM_HASH = "06191a7076e79dcf3e54f58c03f9a1710bf8609caaf47ed5a16157e1b40f0ae1abcbec9bf72222b82a83b4cff0f3182b2116e648cf8da4e0461b26a655ba4468"

RPROVIDES:${PN} += "Botan \
Botan(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbotan-2.so.19()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
