SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-mvebuespressobin-88f3720-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "5b383232da54238fa7af2c8fab0fd7ec6a3f068d7210ee103b0fd18caa5b575093f60b01f51a477f6e9223e5b03b171549d1807d00c5a4c869b46f40335d3337"

RPROVIDES:${PN} += "u-boot-mvebuespressobin-88f3720-doc"

RDEPENDS:${PN} += ""

inherit rpm
