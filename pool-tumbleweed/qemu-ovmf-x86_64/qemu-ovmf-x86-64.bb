SUMMARY = "Open Virtual Machine Firmware - QEMU rom images (x86_64)"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains UEFI rom images for exercising UEFI secure \
boot in a qemu environment (x86_64)"
LICENSE = "BSD-2-Clause-Patent"

PV = "202305"

RPM_NAME = "qemu-ovmf-x86_64-202305-1.1.noarch.rpm"
RPM_HASH = "f8a0d674f694754efd645f978d18bfafc283a7bc903ac3128d58b252759ed6b045173d82252ff7ace37463692ec9a27b7a598e367175973fdced9b43e516d5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ovmf-x86-64"

RDEPENDS:${PN} += "qemu"

inherit rpm
