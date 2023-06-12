SUMMARY = "The U-Boot firmware for the dragonboard410c platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the dragonboard410c platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-dragonboard410c-2023.04-2.1.aarch64.rpm"
RPM_HASH = "7c9bb18eade3eefad99e3d330098e776cd81df175193200a05c7de6294b4b2f8bc253a7c6ec9960df16966441f213317c3b0e04c3b63914d34e330269f2db39b"

RPROVIDES:${PN} += "u-boot-dragonboard410c \
u-boot-dragonboard410c(aarch-64) \
u-boot-loader"
RDEPENDS:${PN} += ""

inherit rpm
