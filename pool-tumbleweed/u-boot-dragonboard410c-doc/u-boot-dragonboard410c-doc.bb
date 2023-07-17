SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-dragonboard410c-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "d4b3d774e8cda1b4c5a17d29a60a9535d446cea32fbba9bce56271fc607d8ad1a93e8787dc4cd7ff4dca0c79af5385458685af9a2235a2f2a12e05d33b8adb8e"

RPROVIDES:${PN} += "u-boot-dragonboard410c-doc"

RDEPENDS:${PN} += ""

inherit rpm
