SUMMARY = "The U-Boot firmware for the avnetultra96rev1 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the avnetultra96rev1 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-avnetultra96rev1-2023.07-1.1.aarch64.rpm"
RPM_HASH = "43d02374dad9dbe355b221e567ce04d83cadaecfeeb4187710b9a9d787c50a5be295407d73d7c0d15183f39fdc56d310379d0e1df884f6826ef9b14badf0b134"

RPROVIDES:${PN} += "u-boot-avnetultra96rev1 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
