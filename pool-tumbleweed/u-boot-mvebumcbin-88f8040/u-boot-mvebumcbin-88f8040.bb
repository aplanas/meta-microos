SUMMARY = "The U-Boot firmware for the mvebumcbin-88f8040 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebumcbin-88f8040 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebumcbin-88f8040-2023.04-2.1.aarch64.rpm"
RPM_HASH = "66ef73c30330a6cf3e1e777ebf7277bf40f83782b668acb3f2b65c747f972b8d19b1db128f70d729188cacb1ac94da9e6476047ebbaa7eb78d8066fcb2dc91eb"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebumcbin-88f8040 \
u-boot-mvebumcbin-88f8040(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
