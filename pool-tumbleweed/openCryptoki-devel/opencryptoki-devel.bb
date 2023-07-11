SUMMARY = "Development files for openCryptoki, a PKCS#11 implementation for IBM hardware"
DESCRIPTION = "The PKCS#11 version 2.01 API implemented for the IBM cryptographic \
cards. This package includes support for the IBM 4758 cryptographic \
co-processor (with the PKCS#11 firmware loaded) and the IBM eServer \
Cryptographic Accelerator (FC 4960 on pSeries)."
LICENSE = "CPL-1.0"

PV = "3.21.0"

RPM_NAME = "openCryptoki-devel-3.21.0-1.3.aarch64.rpm"
RPM_HASH = "813bcef72cb6a85a0a76995e06ceac0bc6c094d1b7778f683511cae6b14a58ef1b5be88c3b29c2e4a1db9ddacfe21e17044a2e7673eb2474ac88c7e61748aa0c"

RPROVIDES:${PN} += "openCryptoki-devel \
pkgconfig-opencryptoki"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libopenssl-devel \
openldap2-devel \
trousers-devel"

inherit rpm
