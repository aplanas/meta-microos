SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-dragonboard820c-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "cc2d0bec36b8190533731aa13d5138385ccccd3b6ae81a594ec18cc02fbc1499a924551b5215ed48dac7db6ff85dd6f6a241201d493b62f34580b46b36874d72"

RPROVIDES:${PN} += "u-boot-dragonboard820c-doc"

RDEPENDS:${PN} += ""

inherit rpm
