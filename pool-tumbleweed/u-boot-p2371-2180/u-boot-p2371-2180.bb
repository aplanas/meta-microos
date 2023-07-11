SUMMARY = "The U-Boot firmware for the p2371-2180 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p2371-2180 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p2371-2180-2023.04-2.2.aarch64.rpm"
RPM_HASH = "6e257cd16ff928dd0a431b2bf09efc410e9e312f24bbacfb538d5a8115e4deff953e9db21667e3e88e025693644183fa49fbc1f78dc949f35842d066f7682137"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-p2371-2180"

RDEPENDS:${PN} += ""

inherit rpm
