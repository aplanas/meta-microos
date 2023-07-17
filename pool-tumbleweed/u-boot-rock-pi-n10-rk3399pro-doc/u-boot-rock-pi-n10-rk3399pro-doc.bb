SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rock-pi-n10-rk3399pro-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "92453de4cc2a1c39e41f1d8933e06c0ce311bc9d926d8c9a502c1071960560bda3119e98a6453d18032d92aa1d193809f2dec343751af99b9a92ad3df5bd8e51"

RPROVIDES:${PN} += "u-boot-rock-pi-n10-rk3399pro-doc"

RDEPENDS:${PN} += ""

inherit rpm
