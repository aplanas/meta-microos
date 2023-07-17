SUMMARY = "The U-Boot firmware for the rpi4 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpi4 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rpi4-2023.07-1.1.aarch64.rpm"
RPM_HASH = "214da7960e73676acedc60c7346cbcb303491c38ce5097f1542dc10d420661bd139cbd9e16606eb30218d8a892ee9ec47aab6f8dab1afa0a8971c6716299e573"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
