SUMMARY = "Library implementing TEE Client API"
DESCRIPTION = "This component provides the TEE Client API as defined by the \
GlobalPlatform TEE standard. For a general overview of OP-TEE, the \
Open Platform Trusted Execution Environment, see the Notice.md file."
LICENSE = "BSD-2-Clause"

PV = "3.9.0"

RPM_NAME = "libteec1-3.9.0-1.11.aarch64.rpm"
RPM_HASH = "3b1f73866a0f04d85408ccc4d2a545e62fd2dacda0b6a994f15ae64d93df38ec86b184d73784c8b818f8e7fec4f2126a2e2a42ad3829afdc1445b8ad94535005"

RPROVIDES:${PN} += "libteec.so.1()(64bit) \
libteec1 \
libteec1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
