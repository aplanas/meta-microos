SUMMARY = "OpenSSL Dynamic PKCS #11 Engine"
DESCRIPTION = "OpenSSL Dynamic PKCS #11 Engine"
LICENSE = "OpenSSL"

PV = "1.0.1"

RPM_NAME = "openssl-ibmpkcs11-1.0.1-1.23.aarch64.rpm"
RPM_HASH = "8ada5e48cd900dab692f18a2225a19291d216ca72bfd2dd50a451888715153b2f8b12edef8c29029952f5fe5990bdfaddf59e7db6f0ff56833d246a1dc4bff15"

RPROVIDES:${PN} += "libibmpkcs11.so.0 \
openssl-ibmpkcs11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
