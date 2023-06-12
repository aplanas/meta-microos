SUMMARY = "Open Virtual Machine Firmware - QEMU rom images (x86_64)"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains UEFI rom images for exercising UEFI secure \
boot in a qemu environment (x86_64)"
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "qemu-ovmf-x86_64-202302-2.2.noarch.rpm"
RPM_HASH = "d548dcb0b2bd47409a124e0ce457e634b32ab6fecb53225961ffd67278a871924fcf6a55f4ffcdf2c893d77dd8dc4add8c367c23f5abf47907a5d5b386f9b2d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ovmf-x86_64"
RDEPENDS:${PN} += "qemu"

inherit rpm
