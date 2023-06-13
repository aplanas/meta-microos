SUMMARY = "Library implementing the PKCS11 API"
DESCRIPTION = "This component provides the PKCS11 API using the PKCS11 trusted \
application executing in OP-TEE.For a general overview of OP-TEE, the \
Open Platform Trusted Execution Environment, see the Notice.md file."
LICENSE = "BSD-2-Clause"

PV = "3.9.0"

RPM_NAME = "libckteec0-3.9.0-1.11.aarch64.rpm"
RPM_HASH = "ad14d4d0213fa464b05d1cf7fbe5f72836bd9f701cd618fcc79e2f40bd5ab2a4aa1efbd3d7338f7d72ebab2686569ba110ae0f1c6c0cd2d8ba775a0e8cf567e9"

RPROVIDES:${PN} += "libckteec.so.0()(64bit) \
libckteec0 \
libckteec0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libteec.so.1()(64bit)"

inherit rpm
