SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpiarm64-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "a1fb3a73bd047f58bd9dbabbfd664930f7234a8bf1c0b0b585e2c22e26846f9221bbe6fa9c78a0ead8ce99e87153a3431aa3e0b28fd43de17dcd3be9d37eee74"

RPROVIDES:${PN} += "u-boot-rpiarm64-doc"

RDEPENDS:${PN} += ""

inherit rpm
