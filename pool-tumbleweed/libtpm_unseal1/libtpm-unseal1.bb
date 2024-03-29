SUMMARY = "Management tools for the TPM hardware (library)"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm-tools package \
provides tools for enablement and configuration of the TPM and \
associated interfaces. Also look inside the trousers package for more \
software for TC. \
 \
This package contains shared libraries"
LICENSE = "IPL-1.0"

PV = "1.3.9.2"

RPM_NAME = "libtpm_unseal1-1.3.9.2-3.6.aarch64.rpm"
RPM_HASH = "d77d34d0c1a5b144f41a177a56f51e36c8ddcdd77a5c7458d06e197dcfd229adb84fb8f4fe1bd8f839e99bc4d5d1715858a00960c3b9b0d5f97a6a7d826c04e7"

RPROVIDES:${PN} += "libtpm-unseal.so.1 \
libtpm-unseal1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtspi.so.1"

inherit rpm
