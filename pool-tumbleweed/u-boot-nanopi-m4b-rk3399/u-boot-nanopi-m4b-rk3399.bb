SUMMARY = "The U-Boot firmware for the nanopi-m4b-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopi-m4b-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-nanopi-m4b-rk3399-2023.07-1.1.aarch64.rpm"
RPM_HASH = "b96ac92fea1bf11677ede549804e80ed67d7d20c5841278cf08b3a96b0043618246eead00458ce8c50e85d5a9a4eaeb95d001d0aae5fa30e00251839ae297194"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopi-m4b-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
