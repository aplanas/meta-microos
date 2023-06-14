SUMMARY = "The U-Boot firmware for the mvebudbarmada8k platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebudbarmada8k platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebudbarmada8k-2023.04-2.1.aarch64.rpm"
RPM_HASH = "03078b1b5827086324282d4214fe9d65586ba2398ff5fcc6976abd66dd7efbb6688ca04321b5ba3271bdddb7178afd37de00f850150118bae09216a19ae44020"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebudbarmada8k"

RDEPENDS:${PN} += ""

inherit rpm
