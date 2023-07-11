SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinephone-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "9e4b172da57014c7c7733ebc4b27563a331123e5b665188fa94fa081f27c3090eecacf58864028d941afab5136bbad1e9dde234d15e4a47c50bc6f20dfd23538"

RPROVIDES:${PN} += "u-boot-pinephone-doc"

RDEPENDS:${PN} += ""

inherit rpm
