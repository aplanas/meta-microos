SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-orangepizero2-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "ad121833d8eeb9279aac9c9496c3668262fc0de2502ca1240aba6ed94dcf3cf0ab3485533149944c9f776117c8d4dfe8660254cda807a08494de87e2a4d97ee8"

RPROVIDES:${PN} += "u-boot-orangepizero2-doc"

RDEPENDS:${PN} += ""

inherit rpm
