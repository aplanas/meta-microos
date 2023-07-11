SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-c2-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "8f710a819933c23fb2529429c4c1d200884844e073df46eb787f395fa05080cce027c47d8db188e7b640a9e6b60f15509900cdadb48adcbedd1c195824116b12"

RPROVIDES:${PN} += "u-boot-odroid-c2-doc"

RDEPENDS:${PN} += ""

inherit rpm
