SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-dragonboard820c-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "1c52ce0740f3badcd07fc7311c5e6f7dfaaa1de28fd3c72c110cdfd573d4d1be728183350698b385441f1bd3206b3bda5f761f9db75e6efdc17eb40661c39de7"

RPROVIDES:${PN} += "u-boot-dragonboard820c-doc"

RDEPENDS:${PN} += ""

inherit rpm
