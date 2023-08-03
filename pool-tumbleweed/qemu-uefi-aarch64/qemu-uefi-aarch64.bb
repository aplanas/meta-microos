SUMMARY = "UEFI QEMU rom image (AArch64)"
DESCRIPTION = "This package contains the UEFI rom image (AArch64) for QEMU cortex-a57 \
virt board."
LICENSE = "BSD-2-Clause-Patent"

PV = "202305"

RPM_NAME = "qemu-uefi-aarch64-202305-1.1.noarch.rpm"
RPM_HASH = "0c6d5182b238d2341cfeb9ae3a8d4bd54a3248e42c97aa34c2e8e6df9d99b264c1b3ee0717af8feedadbeebabb8758a066edf25793e43490ac592f642b94621d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-uefi-aarch64"

RDEPENDS:${PN} += ""

inherit rpm
