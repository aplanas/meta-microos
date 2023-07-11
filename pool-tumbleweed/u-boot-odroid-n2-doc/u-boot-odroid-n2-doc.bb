SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-n2-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "2365d2a6e89baf17bedbb82b52b531277a0261f765e71a62ed0926eae076535a888b0b76aad3bb9193bf06f63d366f1393ff9623b254c91605daea69087caf49"

RPROVIDES:${PN} += "u-boot-odroid-n2-doc"

RDEPENDS:${PN} += ""

inherit rpm
