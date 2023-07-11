SUMMARY = "Quantum-safe crypto provider for OpenSSL"
DESCRIPTION = "This is a plugin/shared library making available quantum-safe cryptography \
(QSC) to OpenSSL 3.x installations via the Provider API. \
 \
Sample call: \
 \
openssl-3 ciphers -provider oqsprovider"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "oqs-provider-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "d46115883be011f18f56b34d86abcd5349ecd1d4a65d8c030eb26e25d9f68ac6c3064a114bec942abdbdc22fc74510f526df96d8fc4f94f86414b87e2bd7816d"

RPROVIDES:${PN} += "oqs-provider"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
liboqs.so.3"

inherit rpm
