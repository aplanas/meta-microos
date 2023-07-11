SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pine64plus-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "d9f0d939105a2cfecf3d53e02e3fada11424d51e8416945cc4fd42a38fc363fe75718f447f6b5c29af9fa789aa1aafb4a869113fe770f74560b63317ec1654d2"

RPROVIDES:${PN} += "u-boot-pine64plus-doc"

RDEPENDS:${PN} += ""

inherit rpm
