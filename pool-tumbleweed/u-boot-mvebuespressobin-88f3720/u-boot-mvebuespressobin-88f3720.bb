SUMMARY = "The U-Boot firmware for the mvebuespressobin-88f3720 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebuespressobin-88f3720 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-mvebuespressobin-88f3720-2023.07-1.1.aarch64.rpm"
RPM_HASH = "6aaac2807fe91e7b8e86bd36b68f0df76455457337091119b95856c6dbf958d217465f2b6ea6530d74c8453c040f3dea8233541f8ec3a94b67dfc54bafeac20d"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebuespressobin-88f3720"

RDEPENDS:${PN} += ""

inherit rpm
