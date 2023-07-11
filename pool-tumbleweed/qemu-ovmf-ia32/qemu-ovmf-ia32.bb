SUMMARY = "Open Virtual Machine Firmware - QEMU rom images (IA32)"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains UEFI rom images for exercising UEFI secure \
boot in a qemu environment (IA32)"
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "qemu-ovmf-ia32-202302-3.1.noarch.rpm"
RPM_HASH = "98027acf7db79ae8299edc43f288078f146ac595a4b19b295b3f11b712993ce7fa735df2c13c6fd7175c6401afb93d672b8fafd98c7f54493b3387e19f9b29f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ovmf-ia32"

RDEPENDS:${PN} += "qemu"

inherit rpm
