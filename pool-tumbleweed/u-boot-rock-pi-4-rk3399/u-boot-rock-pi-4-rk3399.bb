SUMMARY = "The U-Boot firmware for the rock-pi-4-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock-pi-4-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock-pi-4-rk3399-2023.04-2.2.aarch64.rpm"
RPM_HASH = "0ff84596fb2f9b68ee6e35a0db33ecd04c2c0b4d0eaf69f2e610a9bb9b761d84eb1f0abd37bc98b09764f343ecc289ab6509153d7bd75d967df31570c4c636a8"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock-pi-4-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
