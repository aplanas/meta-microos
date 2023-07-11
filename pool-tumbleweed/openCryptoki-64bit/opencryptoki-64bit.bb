SUMMARY = "An Implementation of PKCS#11 (Cryptoki) v2.11 for IBM Cryptographic Hardware"
DESCRIPTION = "This is a re-packaged binary rpm. For the package source, please look \
for the source of the package without the '64bit' ending \
 \
The PKCS#11 version 2.11 API implemented for the IBM cryptographic \
cards. This package includes support for the IBM 4758 cryptographic \
coprocessor (with the PKCS#11 firmware loaded) and the IBM eServer \
Cryptographic Accelerator (FC 4960 on pSeries)."
LICENSE = "CPL-1.0"

PV = "3.21.0"

RPM_NAME = "openCryptoki-64bit-3.21.0-1.3.aarch64.rpm"
RPM_HASH = "1b886d5a699529a98d1ae70ac905b2a3fdae3a92b801b60348b65ecbe97f2f425fa6765aa2278b0f6c119120dbe46e8be87da5f22f14d909fa516e67dd5fd512"

RPROVIDES:${PN} += "libopencryptoki.so.0 \
libpkcs11-icsf.so.0 \
libpkcs11-sw.so.0 \
libpkcs11-tpm.so.0 \
openCryptoki-64bit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
libtspi.so.1 \
openCryptoki"

inherit rpm
