SUMMARY = "The U-Boot firmware for the rpi3 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpi3 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpi3-2023.04-2.2.aarch64.rpm"
RPM_HASH = "0327523bde0eede9381709444fd56e9d609d993d88dba6982e853b2898c65192283701bb674065862093f2a6acca6f92b2d90d4a3bcd0c849cb5f7cf6ee8dd52"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
