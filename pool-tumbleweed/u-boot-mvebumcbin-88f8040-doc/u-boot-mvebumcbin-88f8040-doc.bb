SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-mvebumcbin-88f8040-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "0e61054d5fe0cd35da03407e182043f7d598b7c32b5eaf364359e30b03715680b0dd69b474a6e225a659cead00e1c20c320e303c9426a5af0cc8e2c019d8d89b"

RPROVIDES:${PN} += "u-boot-mvebumcbin-88f8040-doc"

RDEPENDS:${PN} += ""

inherit rpm
