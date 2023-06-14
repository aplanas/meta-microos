SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopia64-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "017f4bddc3903e13d4a5a96dddc411cbae651524e2d5b642338b1ac9fc975abae21158d88f7cb6d36bf30e544710a64d9d03f303834f842ed7971419010f17ed"

RPROVIDES:${PN} += "u-boot-nanopia64-doc"

RDEPENDS:${PN} += ""

inherit rpm
