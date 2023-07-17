SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-mvebudb-88f3720-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "9d2cf9310d4f8cd37da73e6c991daf27a80d11629e7f30b298eddd83eeab969c58e83fc047e261e07a61c355ef32fb2287e24fc5a3230945a7abdbf3d9d618ea"

RPROVIDES:${PN} += "u-boot-mvebudb-88f3720-doc"

RDEPENDS:${PN} += ""

inherit rpm
