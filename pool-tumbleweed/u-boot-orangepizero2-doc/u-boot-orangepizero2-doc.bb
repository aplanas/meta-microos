SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-orangepizero2-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "128fbad04f182f9b3fea8f956d9076088ac1f13f301550fbe168bed28fda444c8588dfb514a0cf10ff61237a33ab289377b465be7d8304e2ae4409d2316529b1"

RPROVIDES:${PN} += "u-boot-orangepizero2-doc"

RDEPENDS:${PN} += ""

inherit rpm
