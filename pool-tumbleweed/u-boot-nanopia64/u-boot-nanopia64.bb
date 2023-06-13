SUMMARY = "The U-Boot firmware for the nanopia64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopia64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopia64-2023.04-2.1.aarch64.rpm"
RPM_HASH = "066eaed35b2a8e11eea205544300e8ad828e7ce4bd75ba32a95f6721a5c3ebecab06ecff92ec16b43b794736fbf8c56999f30372179fa57eab5e0aef14115fe9"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopia64 \
u-boot-nanopia64(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
