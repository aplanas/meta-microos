SUMMARY = "Library implementing TEE Client API"
DESCRIPTION = "This component provides the TEE Client API as defined by the \
GlobalPlatform TEE standard. For a general overview of OP-TEE, the \
Open Platform Trusted Execution Environment, see the Notice.md file."
LICENSE = "BSD-2-Clause"

PV = "3.9.0"

RPM_NAME = "libteec1-3.9.0-1.12.aarch64.rpm"
RPM_HASH = "5914411c644679052e12a5fd1700dc254981c5b9bd55fafb23ae4746815ca9c45cf57bbf2b47ee0cb6e7ca9628b338a6db05dab597bae0b262732a0dcb4ccfd7"

RPROVIDES:${PN} += "libteec.so.1 \
libteec1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
