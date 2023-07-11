SUMMARY = "The U-Boot firmware for the nanopia64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopia64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopia64-2023.04-2.2.aarch64.rpm"
RPM_HASH = "16bb0737967758527245ea06c83b90bd897564f08f3ad4addc6713756a449d332a555e3ff54b5488227021c446b6267bbc22af128f9aa330dc22ac40cb050948"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopia64"

RDEPENDS:${PN} += ""

inherit rpm
