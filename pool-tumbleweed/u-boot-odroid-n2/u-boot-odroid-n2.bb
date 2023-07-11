SUMMARY = "The U-Boot firmware for the odroid-n2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-n2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-n2-2023.04-2.2.aarch64.rpm"
RPM_HASH = "3ff125514cc3ae2cdb0de365894afcff5c98fe43b1b0b6f49e6bcdd1a0f37e7e6f5569b7713a71f7eaef2fa33b7a385441867c494861c737fc8272a32b19cfb5"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-n2"

RDEPENDS:${PN} += ""

inherit rpm
