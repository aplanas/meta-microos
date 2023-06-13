SUMMARY = "Quantum-safe crypto provider for OpenSSL"
DESCRIPTION = "This is a plugin/shared library making available quantum-safe cryptography \
(QSC) to OpenSSL 3.x installations via the Provider API. \
 \
Sample call: \
 \
openssl-3 ciphers -provider oqsprovider"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "oqs-provider-0.3.0-1.2.aarch64.rpm"
RPM_HASH = "e1c7cbb0f6ec176268e2e19c878c3ddb5ce3f0d0d7b86caaeb2102d3ee5d596cb2c025ca54804a20e8783b5423112c09beb5843ad7173b6f4afc9019dbcd4cea"

RPROVIDES:${PN} += "oqs-provider \
oqs-provider(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
liboqs.so.0()(64bit)"

inherit rpm
