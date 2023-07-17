SUMMARY = "The U-Boot firmware for the poplar platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the poplar platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-poplar-2023.07-1.1.aarch64.rpm"
RPM_HASH = "7411063234b99de941a894d2a6393c1ef198fa7e195903e90884f70c8ee84e4f3284318686a09fced4d22763abbe8304f24ddbb645c1fc7198fb2d22a1b87d90"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-poplar"

RDEPENDS:${PN} += ""

inherit rpm
