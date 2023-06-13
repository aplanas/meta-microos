SUMMARY = "Management tools using PKCS#11 for the TPM hardware"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm-tools package \
provides tools for enablement and configuration of the TPM and \
associated interfaces. Also look inside the trousers package for more \
software for TC. \
 \
This package contains group of tools that use the TPM PKCS#11 token. All data \
contained in the PKCS#11 data store is protected by the TPM (keys, \
certificates, etc.). You can import keys and certificates, list out the \
objects in the data store, and protect data."
LICENSE = "IPL-1.0"

PV = "1.3.9.2"

RPM_NAME = "tpm-tools-pkcs11-1.3.9.2-3.6.aarch64.rpm"
RPM_HASH = "1a46e06b5792f73041edb17266d7bbb0fb6b9ffc0a4b62fb7e50fa6fe43c448295c3ff5cd7a65dd88278b592fdf07ad8cd2aed13d1f6068b98ec608983d5bf5e"

RPROVIDES:${PN} += "tpm-tools-pkcs11 \
tpm-tools-pkcs11(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libtspi.so.1()(64bit)"

inherit rpm
