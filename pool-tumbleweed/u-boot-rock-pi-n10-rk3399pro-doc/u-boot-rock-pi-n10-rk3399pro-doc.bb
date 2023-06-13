SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock-pi-n10-rk3399pro-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "48b264fd5a83e7158298a882592b57414bed9b46000e548586c7836839e3d7f35d893ea50dc862c66d942bf29b695a67fcec3eecf5a332d56294618cdd9442f1"

RPROVIDES:${PN} += "u-boot-rock-pi-n10-rk3399pro-doc \
u-boot-rock-pi-n10-rk3399pro-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
