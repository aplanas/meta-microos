SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-bananapim64-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "d289f719f5fdd2bdf525c04220076625fda9a7b91497ee8dd5b322ed7e73294962594d46c11cbbcda031dfcadfcefa2b7e15c4cbb28041dd10d1035aebaff4d8"

RPROVIDES:${PN} += "u-boot-bananapim64-doc"

RDEPENDS:${PN} += ""

inherit rpm
