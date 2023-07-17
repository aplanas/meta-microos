SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-libretech-ac-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "007444a8bb90475c6e17eaddf202f52908d30559f6dd1ec4bfb80ecc7b7aff7ab013f690bbee43b94232f05ba3d21894806f38a06ccfb1964608889eb1eef3a1"

RPROVIDES:${PN} += "u-boot-libretech-ac-doc"

RDEPENDS:${PN} += ""

inherit rpm
