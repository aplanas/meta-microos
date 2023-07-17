SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-odroid-c2-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "c94f2e39a1aabaf386f3a24d1e143aa31c53c89f6025ce281b3ab0c8f6853a86c053fab1a87930634cc80448577d4c608050fa0d4604ae60509edec89bfad95d"

RPROVIDES:${PN} += "u-boot-odroid-c2-doc"

RDEPENDS:${PN} += ""

inherit rpm
