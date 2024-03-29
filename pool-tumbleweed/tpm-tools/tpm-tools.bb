SUMMARY = "Trusted Platform Module (TPM) administration tools"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm-tools package \
provides tools for enablement and configuration of the TPM and \
associated interfaces. Also look inside the trousers package for more \
software for TC."
LICENSE = "IPL-1.0"

PV = "1.3.9.2"

RPM_NAME = "tpm-tools-1.3.9.2-3.6.aarch64.rpm"
RPM_HASH = "d66238fb5101991c5f5129d756ca3011856197667fee6d3b7347e6d91474856028f49a7009a2e185bdd8da024f15b4c68de95b2c743efff2dde9bbe052eb6eb6"

RPROVIDES:${PN} += "tpm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtpm-unseal.so.1 \
libtspi.so.1"

inherit rpm
