SUMMARY = "OpenSSL TPM 2.0 interface engine plugin"
DESCRIPTION = "This package contains a plugin a for OpenSSL which connects it with the \
Trusted Platform Module version 2.0 found on newer machines and a \
create_tpm2_key helper binary to create and extract a TPM key."
LICENSE = "LGPL-2.1-only"

PV = "4.0.1"

RPM_NAME = "openssl_tpm2_engine-4.0.1-1.1.aarch64.rpm"
RPM_HASH = "bdd8e84fd137b5768b6ef465c51ac1426f466bbd97da3645e87c2d520212ad93d13d69c4861034e129bb53f0cd33ea6172abcc69277abe2f524cdfd691e98b5b"

RPROVIDES:${PN} += "libtpm2.so \
openssl-tpm2-engine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libibmtss.so.1"

inherit rpm
