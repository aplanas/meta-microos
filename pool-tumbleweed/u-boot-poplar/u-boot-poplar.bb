SUMMARY = "The U-Boot firmware for the poplar platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the poplar platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-poplar-2023.04-2.2.aarch64.rpm"
RPM_HASH = "b65858f58ea8f43e92f3261940662ca0f97b267f6e21de5483998088d832c4006547f033678f4bb0be9416b67b7ab1b824dfc5fd040537947281f5f6432682a4"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-poplar"

RDEPENDS:${PN} += ""

inherit rpm
