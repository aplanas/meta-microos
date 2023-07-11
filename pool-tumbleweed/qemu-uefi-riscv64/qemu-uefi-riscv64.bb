SUMMARY = "UEFI QEMU rom image (RISC-V 64)"
DESCRIPTION = "This package contains the UEFI rom image (RISC-V 64) for QEMU \
virt board."
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "qemu-uefi-riscv64-202302-3.1.noarch.rpm"
RPM_HASH = "3d23b6384a415af97ca77dbd56a395911b5946a0a530188cd729fd985355e288752b0a235cb9d3902ed6423a2a7c12ef7bbbaaeb6a9fbdfb0b606f536a4a43ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-uefi-riscv64"

RDEPENDS:${PN} += ""

inherit rpm
