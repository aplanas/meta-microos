SUMMARY = "The U-Boot firmware for the khadas-vim platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the khadas-vim platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-khadas-vim-2023.07-1.1.aarch64.rpm"
RPM_HASH = "6dd2a66908f15d29dbbf5421ff4b9a1ab03edd4eb3b9cc6df4cf8424c5d9f29a189aaf2b5c0b58c5fcd631f7997e94a27f9d809b41d8b2f8441e559eddec9189"

RPROVIDES:${PN} += "u-boot-khadas-vim \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
