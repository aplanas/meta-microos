SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-hikey-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "5aac9e6588524d71e51ff5be0b456dd681fd5e804f9a84121a121b046bb7b4eba564d36905c360fc12eb6fe66942f4a89d70f90aca9ab024b15182e0d3b56f14"

RPROVIDES:${PN} += "u-boot-hikey-doc"

RDEPENDS:${PN} += ""

inherit rpm
