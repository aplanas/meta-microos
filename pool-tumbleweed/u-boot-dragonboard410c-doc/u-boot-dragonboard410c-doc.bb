SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-dragonboard410c-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "52dc8019a50abd9773563a659b79d48845d799264c1932c47f32bf4d60996caaf7119524fade6d1f9d8a665a520afb3bd504dc8f2334337872006c81262bd8f3"

RPROVIDES:${PN} += "u-boot-dragonboard410c-doc"

RDEPENDS:${PN} += ""

inherit rpm
