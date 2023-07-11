SUMMARY = "The U-Boot firmware for the bananapim64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the bananapim64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-bananapim64-2023.04-2.2.aarch64.rpm"
RPM_HASH = "5297194fe3a04dd0b258ab2934381f530c155b5282f4cc3c82e894c4f5002e91ba55616d906ae8fad768a290b6d56a72bdc216c494b0ed16660fe36190f27cda"

RPROVIDES:${PN} += "u-boot-bananapim64 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
