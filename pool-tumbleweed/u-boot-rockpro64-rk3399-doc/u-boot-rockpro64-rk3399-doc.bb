SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rockpro64-rk3399-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "addb8dbcb6aa5db37db0e534652b3b7c79c591025227760b79c8d7c09ceff710e70aa2ec8bf91385b9adaf3052a4f60df667c310b072cf12e863271e3d8cdecc"

RPROVIDES:${PN} += "u-boot-rockpro64-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
