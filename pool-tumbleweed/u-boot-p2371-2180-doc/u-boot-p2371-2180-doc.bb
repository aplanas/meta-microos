SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-p2371-2180-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "d4e812fc618d0269073d2455b96c164a1fc9a5f9199abe65edb9b1747ec4b375969214be377e5572b6fead698c8e8adf4044abd0ff205be84f7efdedfb59ae29"

RPROVIDES:${PN} += "u-boot-p2371-2180-doc"

RDEPENDS:${PN} += ""

inherit rpm
