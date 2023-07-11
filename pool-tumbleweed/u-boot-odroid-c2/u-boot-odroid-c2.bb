SUMMARY = "The U-Boot firmware for the odroid-c2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-c2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-c2-2023.04-2.2.aarch64.rpm"
RPM_HASH = "9eaf50fa7cd58e7cf68aaf609a2ddc03a3715fa60b9f037b580df928c194cebae67e50960ea8703d8bb82f1d83033523876414b4417118fe54b4288b7353301f"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-c2"

RDEPENDS:${PN} += ""

inherit rpm
