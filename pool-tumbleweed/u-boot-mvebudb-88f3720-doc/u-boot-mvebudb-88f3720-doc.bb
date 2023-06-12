SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebudb-88f3720-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "7e2e1ccdb62beb31db97851b2e856887aff88d8521d3c25a9b320eb22391048dd4668b49303545597a431fb598067427267090589619e108d08e57456a00a3bb"

RPROVIDES:${PN} += "u-boot-mvebudb-88f3720-doc \
u-boot-mvebudb-88f3720-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
