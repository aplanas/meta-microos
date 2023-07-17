SUMMARY = "The U-Boot firmware for the pine64plus platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pine64plus platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-pine64plus-2023.07-1.1.aarch64.rpm"
RPM_HASH = "f8cf45ccbee363952e481989a7b02ccf104a7924fc5c27fe0a429a9cf426aef6f022b26d811bce44f12fd38397f4a5e97d9801f9d6b20980537e0ccec8288826"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pine64plus"

RDEPENDS:${PN} += ""

inherit rpm
