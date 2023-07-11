SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p2771-0000-500-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "8afa7bc79483247b35452e41015a7d843d3f470be12e627db0d6c9d5910330a251ecaae3d193ec5a537a556ab90d7849518cfae88fee546479355745c204fe9b"

RPROVIDES:${PN} += "u-boot-p2771-0000-500-doc"

RDEPENDS:${PN} += ""

inherit rpm
