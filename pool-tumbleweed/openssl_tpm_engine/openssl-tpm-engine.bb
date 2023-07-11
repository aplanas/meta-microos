SUMMARY = "OpenSSL TPM interface engine plugin"
DESCRIPTION = "This package contains a plugin a for OpenSSL which connects it with the \
Trusted Platform Module found on newer machines and a create_tpm_key \
helper binary to create and extract a TPM key."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2"

RPM_NAME = "openssl_tpm_engine-0.4.2-8.19.aarch64.rpm"
RPM_HASH = "423b439fe888c504f637b9c97d9de2949d444f903906a45359182a90cc66827aaae83242facb6019ca0203981868fc8ba985385c21a779cbdee10d34a36aacd3"

RPROVIDES:${PN} += "openssl-tpm-engine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtspi.so.1"

inherit rpm
