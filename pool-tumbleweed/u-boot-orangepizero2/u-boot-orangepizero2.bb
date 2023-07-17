SUMMARY = "The U-Boot firmware for the orangepizero2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the orangepizero2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-orangepizero2-2023.07-1.1.aarch64.rpm"
RPM_HASH = "a38b4b9c0a0f091d84b15753c6fda6a2da503cf519b8f9b845521b08c0cfe75ebbd23da2ebf7014585a25ae878b7d5a74e472db2ac4be5fd906d3954af13fc4c"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-orangepizero2"

RDEPENDS:${PN} += ""

inherit rpm
