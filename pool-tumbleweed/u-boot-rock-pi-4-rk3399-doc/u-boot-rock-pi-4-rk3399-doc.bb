SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rock-pi-4-rk3399-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "a54ba7676e8276bd98ec3b72295bd95b1ccaf468d215541687fdd913f075074618f20b637c6d96430ae85cf49dfbc12b5b21e8fd4b4abae3cb0f40d3f35b3539"

RPROVIDES:${PN} += "u-boot-rock-pi-4-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
