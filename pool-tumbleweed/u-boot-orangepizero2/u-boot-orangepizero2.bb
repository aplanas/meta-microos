SUMMARY = "The U-Boot firmware for the orangepizero2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the orangepizero2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-orangepizero2-2023.04-2.2.aarch64.rpm"
RPM_HASH = "c51064ffa9f1ef19c1954928151cda575c1e1572a3e73c8f13ddb0d3335918a6b8af324faf6a32cd95984d0a4a38bebc26061e4b529cec8e33008b2058d06c62"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-orangepizero2"

RDEPENDS:${PN} += ""

inherit rpm
