SUMMARY = "The U-Boot firmware for the nanopc-t4-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopc-t4-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopc-t4-rk3399-2023.04-2.2.aarch64.rpm"
RPM_HASH = "02120c5af580bb8b8af6a4cdb4433c61c344dbe77edf9454f1d39e1ef0f0aa3a1635388b4f2375ce2938edeb4710680d17b4bd232a05afaeb44c2b05135bcdf1"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopc-t4-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
