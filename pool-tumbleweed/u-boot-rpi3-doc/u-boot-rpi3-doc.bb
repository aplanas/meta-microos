SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpi3-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "606369ceea9e6d67e11fd5d095b0ba070d09b9b0b75fd41f5c4e911ff3ff01156e4d135bcff8b66fe2c7a50f508c78bd7108c9cbd2acbf89c8de0ed2c64c4723"

RPROVIDES:${PN} += "u-boot-rpi3-doc"

RDEPENDS:${PN} += ""

inherit rpm
