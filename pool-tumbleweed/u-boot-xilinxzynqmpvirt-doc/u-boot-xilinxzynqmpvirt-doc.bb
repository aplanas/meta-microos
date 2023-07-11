SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-xilinxzynqmpvirt-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "d758096325fc12a2bc926b726c36f93a478ee3a1d1481bad8d82afa39ac00ebffddf5300840767c63bf7d66817e0e0b30fd4a014cdad860f8d5a31e479737448"

RPROVIDES:${PN} += "u-boot-xilinxzynqmpvirt-doc"

RDEPENDS:${PN} += ""

inherit rpm
