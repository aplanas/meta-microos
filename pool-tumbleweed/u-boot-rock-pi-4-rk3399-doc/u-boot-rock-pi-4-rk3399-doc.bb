SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock-pi-4-rk3399-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "55b1b89abbd849792565eb1d56e13dfb97ccb9dcd17b3125862a331620bc865cc1a2717e536046bf64a42801f6d06898c5fcf3bb5ced4bc909f3885ffee4d6bd"

RPROVIDES:${PN} += "u-boot-rock-pi-4-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
