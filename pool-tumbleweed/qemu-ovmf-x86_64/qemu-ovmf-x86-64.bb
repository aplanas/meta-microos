SUMMARY = "Open Virtual Machine Firmware - QEMU rom images (x86_64)"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains UEFI rom images for exercising UEFI secure \
boot in a qemu environment (x86_64)"
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "qemu-ovmf-x86_64-202302-3.1.noarch.rpm"
RPM_HASH = "e81dec1d0f1ecac92d04ee81d101aab8750b7b1b594c5495df1d4b9bd852aad6d3de989250d8967fde842d5a035dca84ed4deb7df650bbf0005e49605f4b7cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ovmf-x86-64"

RDEPENDS:${PN} += "qemu"

inherit rpm
