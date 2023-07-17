SUMMARY = "The U-Boot firmware for the nanopia64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopia64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-nanopia64-2023.07-1.1.aarch64.rpm"
RPM_HASH = "87346f84a83e0f9b5bf3de4e74394bb03b7bad16e37bb83141b604ed0bcd92bf80b869213b465d5a813499b8e8539f920d41f9bbed5735cdf9cea5521c381958"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopia64"

RDEPENDS:${PN} += ""

inherit rpm
