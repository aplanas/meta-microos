SUMMARY = "The U-Boot firmware for the libretech-ac platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the libretech-ac platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-libretech-ac-2023.04-2.2.aarch64.rpm"
RPM_HASH = "bf92cba0103bfa7577c1137b8bd2528584456a868af79f35cea5360ab59660ed8c760cc22c174732ad263dc829ff8b23877ea0b1b1d671f092e7df569e22344f"

RPROVIDES:${PN} += "u-boot-libretech-ac \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
