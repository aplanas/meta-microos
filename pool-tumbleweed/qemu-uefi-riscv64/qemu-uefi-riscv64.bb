SUMMARY = "UEFI QEMU rom image (RISC-V 64)"
DESCRIPTION = "This package contains the UEFI rom image (RISC-V 64) for QEMU \
virt board."
LICENSE = "BSD-2-Clause-Patent"

PV = "202305"

RPM_NAME = "qemu-uefi-riscv64-202305-1.1.noarch.rpm"
RPM_HASH = "d2a3b6f6e81212ec6db79e0a1286117c63ad4e86a6d77a5791d0a4ea35f2825dd6d239a993931426195f050c01f87f9fbf4eb325a4beaa34fb9329e596a1db90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-uefi-riscv64"

RDEPENDS:${PN} += ""

inherit rpm
