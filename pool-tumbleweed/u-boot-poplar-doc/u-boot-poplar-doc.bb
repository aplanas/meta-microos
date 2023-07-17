SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-poplar-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "42d9f7ea27a06413aba36d54173e593e4d604b8d619c09abb80c8c5cad4210400f089b5fdfb3edf6cbc3192e3d50c338bf7058d36cb40c95fa5c476429661840"

RPROVIDES:${PN} += "u-boot-poplar-doc"

RDEPENDS:${PN} += ""

inherit rpm
