SUMMARY = "OpenSSL Engine for TPM2 devices"
DESCRIPTION = "The tpm2-tss-engine project implements a cryptographic engine for OpenSSL for \
Trusted Platform Module (TPM 2.0) using the tpm2-tss software stack that follows \
the Trusted Computing Groups (TCG) TPM Software Stack (TSS 2.0). It uses the \
Enhanced System API (ESAPI) interface of the TSS 2.0 for downwards communication. \
It supports RSA decryption and signatures as well as ECDSA signatures."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "tpm2-tss-engine-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "b590c334564c3ee59bb9eced5cc751e7b92c0c771b1f48ac80d722c264ef0dc8a4b588be0c9ca86f132eeaee2b289b3a1e4404165d0ad24a44b4e881c7b298ce"

RPROVIDES:${PN} += "libtpm2tss.so()(64bit) \
tpm2-tss-engine \
tpm2-tss-engine(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libtss2-esys.so.0()(64bit) \
libtss2-mu.so.0()(64bit) \
libtss2-tctildr.so.0()(64bit)"

inherit rpm
