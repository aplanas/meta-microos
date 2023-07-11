SUMMARY = "The U-Boot firmware for the dragonboard820c platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the dragonboard820c platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-dragonboard820c-2023.04-2.2.aarch64.rpm"
RPM_HASH = "0bc845c4fff5fe2ac4c8b05196e93f46de7df0a0eaec2d7621584250a4c800404df69813c9aa7941142e318a7d6c0b7c2b6c52abe1fb056f09e81eb71583c968"

RPROVIDES:${PN} += "u-boot-dragonboard820c \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
