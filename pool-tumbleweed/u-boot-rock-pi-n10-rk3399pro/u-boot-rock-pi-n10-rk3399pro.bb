SUMMARY = "The U-Boot firmware for the rock-pi-n10-rk3399pro platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock-pi-n10-rk3399pro platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock-pi-n10-rk3399pro-2023.04-2.2.aarch64.rpm"
RPM_HASH = "5bf916f689ea9c9dfa53d3ecd29421480aaaee77725b24f628af15ca71be8697dfcc4bb726fb87ce2683804c60ee90e97cc7c94fa847c88943e4cde41163cc1f"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock-pi-n10-rk3399pro"

RDEPENDS:${PN} += ""

inherit rpm
