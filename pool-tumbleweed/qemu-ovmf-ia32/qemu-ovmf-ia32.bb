SUMMARY = "Open Virtual Machine Firmware - QEMU rom images (IA32)"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains UEFI rom images for exercising UEFI secure \
boot in a qemu environment (IA32)"
LICENSE = "BSD-2-Clause-Patent"

PV = "202305"

RPM_NAME = "qemu-ovmf-ia32-202305-1.1.noarch.rpm"
RPM_HASH = "fd4d04e754ef010aedf59acf60b6387ed2d862ee7c8beadbf7121f94f5ed21e9d57ddd2c359b9592d753871c31d6b83eef5764ee64ab0bc5393e4049fa384d24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ovmf-ia32"

RDEPENDS:${PN} += "qemu"

inherit rpm
