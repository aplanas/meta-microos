SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pineh64-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "8c8caeb01c972ea784cbda42918d60e16d1a592ab4027537f70536b67678cc11527c8f288e84d47756a8b5bd7f844e4a5036d18993f0350be4e0275aea50c63e"

RPROVIDES:${PN} += "u-boot-pineh64-doc"

RDEPENDS:${PN} += ""

inherit rpm
