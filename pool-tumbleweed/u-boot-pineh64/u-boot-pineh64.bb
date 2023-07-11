SUMMARY = "The U-Boot firmware for the pineh64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pineh64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pineh64-2023.04-2.2.aarch64.rpm"
RPM_HASH = "3247ccd4f66a894da9d4a0c0d8029d6978cb1f7ba31c419b4f7b46c9bdc3ac8dcb66f2f02cd64fa93c53f168b37f81b5951af1bf3418cce0f23107395df95975"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pineh64"

RDEPENDS:${PN} += ""

inherit rpm
