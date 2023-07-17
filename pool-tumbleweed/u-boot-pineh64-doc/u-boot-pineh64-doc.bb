SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-pineh64-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "ecd971ea014a4dcc2cd65728073a313d992a351d00aef4e3960cfc2e01afcfbfd3b31864490b3a1ed0c563bf706a3f9e2dd8853e0a7ec835f66e3235b80a09d8"

RPROVIDES:${PN} += "u-boot-pineh64-doc"

RDEPENDS:${PN} += ""

inherit rpm
