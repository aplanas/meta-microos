SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rpi4-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "b28bd174caa1eb16e2fdb57ec1e1728fe92b1469267e89b66be6cc6020b4657fb3e00ea86ea12f84100e06cf028a4ff89ffd061e2dd6e603def24cd4862aa62d"

RPROVIDES:${PN} += "u-boot-rpi4-doc"

RDEPENDS:${PN} += ""

inherit rpm
