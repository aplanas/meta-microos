SUMMARY = "The U-Boot firmware for the dragonboard820c platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the dragonboard820c platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-dragonboard820c-2023.07-1.1.aarch64.rpm"
RPM_HASH = "e0d8824572984a3de5da8a933891d5ca866778e2a54bfb9f0d64ad403aff32b2415350052e20f5fb3d052bb4185226d47740dfe0c5302966dd43a56265e1216e"

RPROVIDES:${PN} += "u-boot-dragonboard820c \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
