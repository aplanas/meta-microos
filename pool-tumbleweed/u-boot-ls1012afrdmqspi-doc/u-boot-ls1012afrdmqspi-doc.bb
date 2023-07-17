SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-ls1012afrdmqspi-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "84fbc11822df606830397c4134f0aa58cb5cfc160e315bb4c3629aaee14be3b1ceaa32aa1d8b1f4518aac95bc18d21435e8b3b4d2ab169546a5819f20d34344b"

RPROVIDES:${PN} += "u-boot-ls1012afrdmqspi-doc"

RDEPENDS:${PN} += ""

inherit rpm
