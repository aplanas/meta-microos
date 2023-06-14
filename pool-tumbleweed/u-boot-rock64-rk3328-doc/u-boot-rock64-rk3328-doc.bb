SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock64-rk3328-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "9b67c797b858dbd9ce8af8afa61b87c7158c8a86c42f7d5246895ab44e1ecec7259c0ba7d86ece00faac6ffc17cad79afd16f3d5652c24957e67b994a2008352"

RPROVIDES:${PN} += "u-boot-rock64-rk3328-doc"

RDEPENDS:${PN} += ""

inherit rpm
