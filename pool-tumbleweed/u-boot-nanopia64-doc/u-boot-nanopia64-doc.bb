SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopia64-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "98d7469c496395a8aff287ae63b789daadaf9846021601c832df28220201d7ff5daa89c3f4e24a4925f89a05007ecc844ea04c5057e10574fdfbac51ee465947"

RPROVIDES:${PN} += "u-boot-nanopia64-doc"

RDEPENDS:${PN} += ""

inherit rpm
