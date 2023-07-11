SUMMARY = "The U-Boot firmware for the mvebuespressobin-88f3720 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebuespressobin-88f3720 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebuespressobin-88f3720-2023.04-2.2.aarch64.rpm"
RPM_HASH = "1c01ea2c69a7b400e22f74f2125b55c5c21801fe2fdff6cfee58b75d09634aac2d2414f6053ce57399f1b824c83b4cfbe40cfe1152ce8b9460356047322aa12f"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebuespressobin-88f3720"

RDEPENDS:${PN} += ""

inherit rpm
