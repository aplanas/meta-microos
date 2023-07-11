SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-khadas-vim-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "98eacab5115e9a8a83cc74ef3b52640dfaff109e9738607ff80d42772caf2665dda64687e5367bcc32e2c9a25a06b92e4f92633eecbb2f0478c796b7ec434f05"

RPROVIDES:${PN} += "u-boot-khadas-vim-doc"

RDEPENDS:${PN} += ""

inherit rpm
