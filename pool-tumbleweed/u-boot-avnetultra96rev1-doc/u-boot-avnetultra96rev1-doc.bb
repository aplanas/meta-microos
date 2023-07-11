SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-avnetultra96rev1-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "de7494e3708a928dcd8052001919e838e6348cd087a487959d1c6d5b1aec1e05c41bc9e911e7f9938b32a30e27985e6bdbf77034ffec5236f594f6cb7b6549cd"

RPROVIDES:${PN} += "u-boot-avnetultra96rev1-doc"

RDEPENDS:${PN} += ""

inherit rpm
