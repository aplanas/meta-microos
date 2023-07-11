SUMMARY = "The U-Boot firmware for the dragonboard410c platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the dragonboard410c platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-dragonboard410c-2023.04-2.2.aarch64.rpm"
RPM_HASH = "04f2df09d63d4f3442181c40d5590d8f6cfa6ee132730bf1bb49da075725d6659b0bb03385f5e97916d5a5c5956bc7b09f574e74f877e96fc6c76e76c526ec79"

RPROVIDES:${PN} += "u-boot-dragonboard410c \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
