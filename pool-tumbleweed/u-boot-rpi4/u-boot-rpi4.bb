SUMMARY = "The U-Boot firmware for the rpi4 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpi4 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpi4-2023.04-2.1.aarch64.rpm"
RPM_HASH = "d93a9486bdd7ab996dfcbae4673daaaf9586748545d32ffd9b767d9c7bf593491e00281d60e100e60ab3c25eb523027ce7441d9163082be31f7c7789c0058325"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
