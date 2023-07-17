SUMMARY = "The U-Boot firmware for the mvebudb-88f3720 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebudb-88f3720 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-mvebudb-88f3720-2023.07-1.1.aarch64.rpm"
RPM_HASH = "3c3376c956213e3fcfa7445bec1559554f7fef502594e33409e5be18a1c9fe4e0b1d745bea6a37cd9b4fdfcb3663056ef657f8da62b1571ef8a625221bb77bd0"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebudb-88f3720"

RDEPENDS:${PN} += ""

inherit rpm
