SUMMARY = "Portable NaCl-based crypto library"
DESCRIPTION = "NaCl (pronounced 'salt') is a new easy-to-use high-speed software library \
for network communication, encryption, decryption, signatures, etc. NaCl's goal \
is to provide all of the core operations needed to build higher-level cryptographic tools. \
 \
Sodium is a portable, cross-compilable, installable, packageable fork of NaCl, \
with a compatible API."
LICENSE = "ISC"

PV = "1.0.18"

RPM_NAME = "libsodium23-1.0.18-2.14.aarch64.rpm"
RPM_HASH = "5b62d4a7f2ef8e24f005b79a56bdb1c0a13781f6644cb79585a015ba06bce2f7c733c5fe81403127d80eaa7534423a2d96a2f562b8724b1a7d10892ae56ab330"

RPROVIDES:${PN} += "libsodium.so.23()(64bit) \
libsodium23 \
libsodium23(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
