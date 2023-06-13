SUMMARY = "Open Virtual Machine Firmware - QEMU rom images (IA32)"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains UEFI rom images for exercising UEFI secure \
boot in a qemu environment (IA32)"
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "qemu-ovmf-ia32-202302-2.2.noarch.rpm"
RPM_HASH = "3b16ea1fa991519d5773c09794f6f854e8745028cde625a5de28dad8e4e849c26dbfcee37f66ba183731772d678dc16fb9eea26cb6af2768f7038041183d9977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ovmf-ia32"

RDEPENDS:${PN} += "qemu"

inherit rpm
