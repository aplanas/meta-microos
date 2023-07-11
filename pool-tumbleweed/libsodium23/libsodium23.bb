SUMMARY = "Portable NaCl-based crypto library"
DESCRIPTION = "NaCl (pronounced 'salt') is a new easy-to-use high-speed software library \
for network communication, encryption, decryption, signatures, etc. NaCl's goal \
is to provide all of the core operations needed to build higher-level cryptographic tools. \
 \
Sodium is a portable, cross-compilable, installable, packageable fork of NaCl, \
with a compatible API."
LICENSE = "ISC"

PV = "1.0.18"

RPM_NAME = "libsodium23-1.0.18-2.15.aarch64.rpm"
RPM_HASH = "5fd8c10b334e5453870808687d49ba8061becb4fd456ac86702843c5bc8ff19f3df3f2eaca2224fb8eb7d4c69c5b9f06a94d783ccee413efda3bc42bceadfaa4"

RPROVIDES:${PN} += "libsodium.so.23 \
libsodium23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
