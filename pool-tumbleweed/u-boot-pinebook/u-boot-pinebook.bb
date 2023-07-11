SUMMARY = "The U-Boot firmware for the pinebook platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinebook platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinebook-2023.04-2.2.aarch64.rpm"
RPM_HASH = "bb6655e2f4f31670c05f9b9eda5d8af6967359933360bea0d3238478ba94dd321875e6cb913148a895d08c5346019f91b64e82c3885287496e31c7102a7abbf4"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinebook"

RDEPENDS:${PN} += ""

inherit rpm
