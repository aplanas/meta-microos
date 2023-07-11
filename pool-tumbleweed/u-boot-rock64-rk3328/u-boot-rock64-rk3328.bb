SUMMARY = "The U-Boot firmware for the rock64-rk3328 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock64-rk3328 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock64-rk3328-2023.04-2.2.aarch64.rpm"
RPM_HASH = "506a3b43613102835e72d976b971ea43ce92286f0c87eb3fb8d1b6bfda72bd75e45c9a7366b6ee0ac941207655f7442cd0420d5fbe8b80cc01f8bd3bc4043aeb"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock64-rk3328"

RDEPENDS:${PN} += ""

inherit rpm
