SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-poplar-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "a514f886accc8c20082a1c36a3105e3fad75bae299d5e15f1e8d326ba903baa10727f685d0f1d09ba3d819822684e9196cd493cd3791ce5a46f2f7f6cdc0ea33"

RPROVIDES:${PN} += "u-boot-poplar-doc"

RDEPENDS:${PN} += ""

inherit rpm
