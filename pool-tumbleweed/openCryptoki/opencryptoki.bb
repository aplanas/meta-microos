SUMMARY = "An Implementation of PKCS#11 (Cryptoki) v2.11 for IBM Cryptographic Hardware"
DESCRIPTION = "The PKCS#11 version 2.11 API implemented for the IBM cryptographic \
cards. This package includes support for the IBM 4758 cryptographic \
coprocessor (with the PKCS#11 firmware loaded) and the IBM eServer \
Cryptographic Accelerator (FC 4960 on pSeries)."
LICENSE = "CPL-1.0"

PV = "3.21.0"

RPM_NAME = "openCryptoki-3.21.0-1.1.aarch64.rpm"
RPM_HASH = "33eb376d7be4ede23e721ece936a971505ae7e28b2ffdad99afefa11136f7f1e5b18da763653723509faf2aacd3c9849d0bca2bb6a294a0d8dee745e841593a6"

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
