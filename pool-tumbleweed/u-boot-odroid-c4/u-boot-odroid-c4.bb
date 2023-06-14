SUMMARY = "The U-Boot firmware for the odroid-c4 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-c4 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-c4-2023.04-2.1.aarch64.rpm"
RPM_HASH = "062509ed230ffa3c0d17b021cd81fb7be15cb22142713a75026ad7edeb40b960a732b2f3cf6b878a88915cfcafdcd73c5edf0d595e744950ac0c3bb06e592b56"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-c4"

RDEPENDS:${PN} += ""

inherit rpm
