SUMMARY = "A Trusted Execution Environment client"
DESCRIPTION = "This component provides the TEE Client API as defined by the \
GlobalPlatform TEE standard. For a general overview of OP-TEE, the \
Open Platform Trusted Execution Environment, see the Notice.md file."
LICENSE = "BSD-2-Clause"

PV = "3.9.0"

RPM_NAME = "optee-client-3.9.0-1.12.aarch64.rpm"
RPM_HASH = "a9f80d72fb9c7ede7f55df2c1d1290fc002d8e15036bc4b234e7cfdcb5e144fc31bd8c93efc803ee14eed9969030fc4dc5e34d2ce0489f5538c7c34321035265"

RPROVIDES:${PN} += "optee-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libteec.so.1"

inherit rpm
