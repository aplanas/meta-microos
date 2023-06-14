SUMMARY = "OpenSSL TPM interface engine plugin"
DESCRIPTION = "This package contains a plugin a for OpenSSL which connects it with the \
Trusted Platform Module found on newer machines and a create_tpm_key \
helper binary to create and extract a TPM key."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2"

RPM_NAME = "openssl_tpm_engine-0.4.2-8.18.aarch64.rpm"
RPM_HASH = "eae7adda0e688061b58b3168a8f02b9a61e21a161b9313f8e4697846ff22d9c60cfd4b7c02b5eb6b2b98f3b9b9930745e279f36f7e8232b3ca12aa5af21601d5"

RPROVIDES:${PN} += "openssl-tpm-engine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtspi.so.1"

inherit rpm
