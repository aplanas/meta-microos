SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-libretech-ac-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "2ac3528aebcda7fd9f6594fca7e66ae0f1587241fa24a8fde32e77e0c97138aa38eda611032e5ae8b5ac74b26f54d34ddc082727ec3c22f49911eef245f60c40"

RPROVIDES:${PN} += "u-boot-libretech-ac-doc"

RDEPENDS:${PN} += ""

inherit rpm
