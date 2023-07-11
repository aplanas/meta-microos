SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-khadas-vim2-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "a9a338a300366218ee79f5f2254d14e4b9e0c5ba38952325f87238bd582ce113f363aa4433f211e9d247b3e54df7d2b8c8aafd96541225d8d8893662cc66d0b3"

RPROVIDES:${PN} += "u-boot-khadas-vim2-doc"

RDEPENDS:${PN} += ""

inherit rpm
