SUMMARY = "The U-Boot firmware for the evb-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the evb-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-evb-rk3399-2023.04-2.2.aarch64.rpm"
RPM_HASH = "49ea1cbe06e7f4aa4d1036586a82b987ea201a75d89b256f4c8cd1266b62f3023e9e3d58ed487975210d56425410863c17372fb0442f5d7636bf88db022d80ab"

RPROVIDES:${PN} += "u-boot-evb-rk3399 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
