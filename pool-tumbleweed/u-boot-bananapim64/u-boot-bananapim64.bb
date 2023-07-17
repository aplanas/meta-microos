SUMMARY = "The U-Boot firmware for the bananapim64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the bananapim64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-bananapim64-2023.07-1.1.aarch64.rpm"
RPM_HASH = "27ccd1f8a3b021e8941ac8e2c01415f77fb83d1ebf6f6e7dd0fa0962e349e1445fe3fa952b58be170c5ba1c0fb27a232aa2f5ccd4feee3bd6bdb8881ba9f8628"

RPROVIDES:${PN} += "u-boot-bananapim64 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
