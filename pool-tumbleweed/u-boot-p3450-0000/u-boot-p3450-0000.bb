SUMMARY = "The U-Boot firmware for the p3450-0000 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p3450-0000 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p3450-0000-2023.04-2.2.aarch64.rpm"
RPM_HASH = "2b252bc1a7e4dc13db0d13035407bcbdaee0106ddb3ed0f6335e24b54130d91f49009d40c50a1e58c2a027046482692308ccc1f54d2b459aa668f1d43b7a4f39"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-p3450-0000"

RDEPENDS:${PN} += ""

inherit rpm
