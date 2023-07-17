SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-orangepizero2-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "c7ca56e2f4a58facaa582032bed14763215c620799ce07819a8a7ff2e7b36c5a20bc27b240a0cbb3e1f6481c7f7c551dd7901a32774cab67d9da15332f9c01cb"

RPROVIDES:${PN} += "u-boot-orangepizero2-doc"

RDEPENDS:${PN} += ""

inherit rpm
