SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-libretech-cc-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "6a35b2e084803d58892b7bc93ddf45cbfeb120945f4dd7d8ed9efcfba0c618600d519e1b070d3c35bd5bebdde11c629d3253636be2fdf199facdac7735477fe1"

RPROVIDES:${PN} += "u-boot-libretech-cc-doc"

RDEPENDS:${PN} += ""

inherit rpm
