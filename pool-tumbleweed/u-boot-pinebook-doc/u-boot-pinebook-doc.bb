SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinebook-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "9cca0dd0f0e08e2c43f68ac8dc6091e21c6a30c3dd13f45dc37a04084ca7facd4ea20a870a12ffd19ffe78cb6dd57fb65f4009c3651f1830255fcc89171a8ba9"

RPROVIDES:${PN} += "u-boot-pinebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
