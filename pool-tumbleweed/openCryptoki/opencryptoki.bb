SUMMARY = "An Implementation of PKCS#11 (Cryptoki) v2.11 for IBM Cryptographic Hardware"
DESCRIPTION = "The PKCS#11 version 2.11 API implemented for the IBM cryptographic \
cards. This package includes support for the IBM 4758 cryptographic \
coprocessor (with the PKCS#11 firmware loaded) and the IBM eServer \
Cryptographic Accelerator (FC 4960 on pSeries)."
LICENSE = "CPL-1.0"

PV = "3.21.0"

RPM_NAME = "openCryptoki-3.21.0-1.3.aarch64.rpm"
RPM_HASH = "958d297a33b3d51f3f8ab33b8f8a78efb52d4b32a2d66bfd1041204bbec7aa8069ca575cc71a957b60e235cca542416a3937d24d4d6aae3b2db423f7a9d33892"

RPROVIDES:${PN} += "config-openCryptoki \
openCryptoki"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/usermod \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
systemd"

inherit rpm
