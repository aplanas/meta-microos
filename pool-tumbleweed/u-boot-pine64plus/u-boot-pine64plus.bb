SUMMARY = "The U-Boot firmware for the pine64plus platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pine64plus platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pine64plus-2023.04-2.1.aarch64.rpm"
RPM_HASH = "fd23617729997476d6d3e2b6800fc524e21284e0215f178fd59683d262ea8cd3378a86b3719d4ee20e109417e49060f97fcd6a84707ce68a767c1c438cd4ac20"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pine64plus \
u-boot-pine64plus(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
