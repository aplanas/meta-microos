SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopc-t4-rk3399-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "9c3cb23929d6ee480ec6a03918c971e849b6dce5330aa16be27cbf73705eb3d387b00a7740d6ef259d35c7b28088463723dd8806d73db35265fabc25b7381b9a"

RPROVIDES:${PN} += "u-boot-nanopc-t4-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
