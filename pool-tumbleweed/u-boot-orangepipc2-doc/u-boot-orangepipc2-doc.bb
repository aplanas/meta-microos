SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-orangepipc2-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "5407258e5c322f1a61d3f87a25a2a27f236dc58ca57a2dce45bafcbf6dd25c590477b8591bab0f01750ad7e3603264ecefae4795ed4baf1b6f780c31e50ca794"

RPROVIDES:${PN} += "u-boot-orangepipc2-doc"

RDEPENDS:${PN} += ""

inherit rpm
