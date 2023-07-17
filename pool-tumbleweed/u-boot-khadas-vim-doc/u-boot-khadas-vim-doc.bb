SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-khadas-vim-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "6020292e2210ff0e2817fa455e26e7d451424dd2d0d73f3e75f3bdb352bdbd3bb4ba348c88edf1f64861055a094b57602adfb688f0aff36de13e9e884a12fb50"

RPROVIDES:${PN} += "u-boot-khadas-vim-doc"

RDEPENDS:${PN} += ""

inherit rpm
