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

RPM_NAME = "openCryptoki-64bit-3.21.0-1.1.aarch64.rpm"
RPM_HASH = "cfbc7e876ca9cc1058fa1e23b90e078564a9ffe144ba2dec9289248e4fd912af07c1e491df817ee8b7d703129983a61b57622ba046d09d538aa4cbdcff3da9da"

RPROVIDES:${PN} += "libopencryptoki.so.0 \
libpkcs11-icsf.so.0 \
libpkcs11-sw.so.0 \
libpkcs11-tpm.so.0 \
openCryptoki-64bit"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
libtspi.so.1 \
openCryptoki"

inherit rpm
