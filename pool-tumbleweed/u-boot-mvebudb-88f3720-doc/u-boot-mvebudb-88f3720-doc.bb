SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebudb-88f3720-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "708fa3b46ce99d75d398676db34e9667b349a10132d4266990c3f4616435ca8f60fc90966cf7f824467e4b9ec42d1be49b08235eb1f6b3590fd2a73f1713ff73"

RPROVIDES:${PN} += "u-boot-mvebudb-88f3720-doc"

RDEPENDS:${PN} += ""

inherit rpm
