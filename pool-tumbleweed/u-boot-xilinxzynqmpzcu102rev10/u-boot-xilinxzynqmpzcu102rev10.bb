SUMMARY = "The U-Boot firmware for the xilinxzynqmpzcu102rev10 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the xilinxzynqmpzcu102rev10 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-xilinxzynqmpzcu102rev10-2023.04-2.1.aarch64.rpm"
RPM_HASH = "d1e3599ee72bcf4a0edec8f37a72ca03f8edc26d4a8c5d37f11f2fe3a6ae8c6e0b5703a558288da908ae7f5ce113dd180cf934a2686e0b8949687a11d24a0dd0"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-xilinxzynqmpzcu102rev10"

RDEPENDS:${PN} += ""

inherit rpm
