SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-nanopia64-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "6556345d59bb3c89ea005894d49f1f862d53d468095e75d349b942069fa71dc0f0bbcf17f8f102dd6a5eb71ba38e57ebe9ac40100274b88d33b2ac986b637c17"

RPROVIDES:${PN} += "u-boot-nanopia64-doc"

RDEPENDS:${PN} += ""

inherit rpm
