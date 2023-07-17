SUMMARY = "The U-Boot firmware for the firefly-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the firefly-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-firefly-rk3399-2023.07-1.1.aarch64.rpm"
RPM_HASH = "107d99ffc1ba0d36b9c108af1eef2a2fabebb2eda4603769a1af09eeb435177d8a64046c53b84ccc0ca20fc492972990b8d304faa189dd27aacb81a55a1db924"

RPROVIDES:${PN} += "u-boot-firefly-rk3399 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
