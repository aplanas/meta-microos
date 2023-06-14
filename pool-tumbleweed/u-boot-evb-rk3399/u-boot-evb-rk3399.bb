SUMMARY = "The U-Boot firmware for the evb-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the evb-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-evb-rk3399-2023.04-2.1.aarch64.rpm"
RPM_HASH = "310aa9618b6289c95f6e9030e861cc70f23d417937cd018eedeae6fa270b1ff7b422a3424ff62470c100c64e79869893c52c0b1331ce75edac29705affbec750"

RPROVIDES:${PN} += "u-boot-evb-rk3399 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
