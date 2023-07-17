SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-nanopi-m4b-rk3399-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "cb1383bef43d452f2a3605b471abbc80f9e4791f018df68a2afa46b36c6f6b1a70d9563dd844e7564756fd1a092c032cc1db27085d8c3d6585b981282ad46763"

RPROVIDES:${PN} += "u-boot-nanopi-m4b-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
