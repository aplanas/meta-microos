SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-xilinxzynqmpzcu102rev10-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "622fa4329386c8b55a466d291209b846d095f3646f751700caa0427a9c6fa3e8729bb6baea1b870160cedfb36d726fddadf7b57a0f35eb1b873fc0c294cc87ae"

RPROVIDES:${PN} += "u-boot-xilinxzynqmpzcu102rev10-doc"

RDEPENDS:${PN} += ""

inherit rpm
