SUMMARY = "The U-Boot firmware for the nanopi-m4b-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopi-m4b-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopi-m4b-rk3399-2023.04-2.2.aarch64.rpm"
RPM_HASH = "e4fea443d840f39d4c2ae9ede13b902c12bbd68e6f0905b6967bd973aecb582dc1fc4df011249bf2d115283142753bbd34d48bc81d27f54364bf32666fde4c59"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopi-m4b-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
