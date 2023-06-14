SUMMARY = "The U-Boot firmware for the xilinxzynqmpvirt platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the xilinxzynqmpvirt platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-xilinxzynqmpvirt-2023.04-2.1.aarch64.rpm"
RPM_HASH = "0d5da690a36edd6ee35944816339c8fec80ad38d80157359e1f569b3fb2e87d69ac81cd1a4180a017bb06ac148ffbcb5fa6a78b9d2f5664e3fc93ef6c170e0b4"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-xilinxzynqmpgeneric \
u-boot-xilinxzynqmpvirt"

RDEPENDS:${PN} += ""

inherit rpm
