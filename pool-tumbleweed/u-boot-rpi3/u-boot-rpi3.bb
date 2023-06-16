SUMMARY = "The U-Boot firmware for the rpi3 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpi3 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpi3-2023.04-2.1.aarch64.rpm"
RPM_HASH = "9dd817ed7389e6b09478e69d0c9817afca6512ae003159b4ee81c7971fb18ff023f57cd5f991b22a8f830bb61695f4c719fa094eb44e44264af142f5a47ed102"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
