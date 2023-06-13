SUMMARY = "Trusted Platform Module (TPM) 2.0 administration tools"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm2.0-tools package \
provides tools for enablement and configuration of the TPM 2.0 and \
associated interfaces."
LICENSE = "BSD-3-Clause"

PV = "5.5"

RPM_NAME = "tpm2.0-tools-5.5-2.1.aarch64.rpm"
RPM_HASH = "0e74913a323081c53dcf956977cacb9821b4e0bb783fc7cbecd6e209b1899e6b9dbd55a62c581a2f042d959ef5278ad9c2a62634b8bda04a88eefcdb0f793b92"

RPROVIDES:${PN} += "tpm2.0-tools \
tpm2.0-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libtss2-esys.so.0()(64bit) \
libtss2-fapi.so.1()(64bit) \
libtss2-mu.so.0()(64bit) \
libtss2-rc.so.0()(64bit) \
libtss2-sys.so.1()(64bit) \
libtss2-tctildr.so.0()(64bit)"

inherit rpm
