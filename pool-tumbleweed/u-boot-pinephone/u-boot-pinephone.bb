SUMMARY = "The U-Boot firmware for the pinephone platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinephone platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinephone-2023.04-2.2.aarch64.rpm"
RPM_HASH = "ab46ffe62b2f707b8187f4cc14ec681242d1af3564ceb16e25cd6c5d66aee9060955bc15cafc0111bd3bc11129b8f3eb0e2a8b1d75bfe91d99ce3e4fe34825f8"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinephone"

RDEPENDS:${PN} += ""

inherit rpm
