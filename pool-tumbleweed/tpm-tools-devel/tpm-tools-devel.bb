SUMMARY = "Files to use the library routines supplied with tpm-tools"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm-tools package \
provides tools for enablement and configuration of the TPM and \
associated interfaces. Also look inside the trousers package for more \
software for TC. \
 \
This package contains the libraries and headers necessary for developing \
tpm-tools applications."
LICENSE = "IPL-1.0"

PV = "1.3.9.2"

RPM_NAME = "tpm-tools-devel-1.3.9.2-3.6.aarch64.rpm"
RPM_HASH = "8f164fd5bbc857500824326c13b1a0c57a4fd55caf587fc2b85d77bde3903e7e9c79aeac07d58335d41d7afa1db87c8f14194646d0789e3acc54190861dabca2"

RPROVIDES:${PN} += "tpm-tools-devel \
tpm-tools-devel(aarch-64)"
RDEPENDS:${PN} += "libtpm_unseal1"

inherit rpm
