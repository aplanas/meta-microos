SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-khadas-vim2-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "6911b753f634d131ea5033daacb25fb26ce39a8b290eb58e2a685db7bea5ecb9b7740f76db5343510ac8bde6b20aa1ad5ac74e509daaa7f340336367de44adf3"

RPROVIDES:${PN} += "u-boot-khadas-vim2-doc"

RDEPENDS:${PN} += ""

inherit rpm
