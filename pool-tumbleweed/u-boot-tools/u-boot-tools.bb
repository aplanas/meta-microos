SUMMARY = "Tools for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains: \
mkimage- a tool that creates kernel bootable images for U-Boot."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-tools-2023.04-2.1.aarch64.rpm"
RPM_HASH = "d72b26d33a9b8ec5f55dcd30535201882e7754817c29d0f3a20caa13ed938e6e8b67154306ad867af1dd1c721e8f3f6c97affa0353ae3f954b89e4b03b6942d1"

RPROVIDES:${PN} += "u-boot-tools"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
