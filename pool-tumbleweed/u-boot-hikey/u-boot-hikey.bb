SUMMARY = "The U-Boot firmware for the hikey platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the hikey platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-hikey-2023.04-2.2.aarch64.rpm"
RPM_HASH = "374e482f047c0329fd23720123b6a7c633f559e10fdc2950f2d7d43531f8cfc36b334daf7fcd9f6ce9015254fde9acd0e05057f48db31f83409584b6d4369d06"

RPROVIDES:${PN} += "u-boot-hikey \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
