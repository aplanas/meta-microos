SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock-pi-4-rk3399-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "4ff692342e851c485aec8915ba99a0fd4333e4bfb28f88daf3107cd40a48edead81cc1b733a9a33e6a286dddece881c2bbab58d95ef055094211e915def35ec9"

RPROVIDES:${PN} += "u-boot-rock-pi-4-rk3399-doc \
u-boot-rock-pi-4-rk3399-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
