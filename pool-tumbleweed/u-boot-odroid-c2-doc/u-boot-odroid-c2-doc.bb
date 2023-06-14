SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-c2-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "90496c579c10459e07a9101e2f710c3835f1180bdbd06a73361acbe297db5ba58c6cf528b0250a939017b9ed5efdb26a18c226e301a1cc5315244be820e4805a"

RPROVIDES:${PN} += "u-boot-odroid-c2-doc"

RDEPENDS:${PN} += ""

inherit rpm
