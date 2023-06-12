SUMMARY = "Devel files for tpm2-tss-engine"
DESCRIPTION = "Development files for tpm2-tss-engine, an OpenSSL engine for TPM2 devices. \
 \
The tpm2-tss-engine project implements a cryptographic engine for OpenSSL for \
Trusted Platform Module (TPM 2.0) using the tpm2-tss software stack that follows \
the Trusted Computing Groups (TCG) TPM Software Stack (TSS 2.0). It uses the \
Enhanced System API (ESAPI) interface of the TSS 2.0 for downwards communication. \
It supports RSA decryption and signatures as well as ECDSA signatures."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "tpm2-tss-engine-devel-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "a39bf7e192f3a58364b21fc68535481ef3835b88345c8a1d585a09512b73d1662fc405f727b78ec581db7d09c03c1bb6aee7b1ebd30668561dde43caa18f2a0c"

RPROVIDES:${PN} += "tpm2-tss-engine-devel \
tpm2-tss-engine-devel(aarch-64)"
RDEPENDS:${PN} += "tpm2-tss-engine"

inherit rpm
