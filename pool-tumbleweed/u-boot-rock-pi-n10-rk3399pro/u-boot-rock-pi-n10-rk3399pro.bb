SUMMARY = "The U-Boot firmware for the rock-pi-n10-rk3399pro platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock-pi-n10-rk3399pro platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rock-pi-n10-rk3399pro-2023.07-1.1.aarch64.rpm"
RPM_HASH = "37136e7ed0e38e745cdca195a1c91a472e2b4f76691eb12a1455ca6bf99dcb27688990c8928a25aa31f952df0378ac2fa5827670f356a7a7c854c61435f10890"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock-pi-n10-rk3399pro"

RDEPENDS:${PN} += ""

inherit rpm
