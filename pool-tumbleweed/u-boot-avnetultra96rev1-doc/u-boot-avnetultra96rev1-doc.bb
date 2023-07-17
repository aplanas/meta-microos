SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-avnetultra96rev1-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "a0fae5cbaadaf7d6a4c704bec409f85943fcaf4162352d7fb1e79309c3dcf6444a4bc1a0224e3a0f8247dee63511efb61901673fdac11dbc8672fea543b5b28a"

RPROVIDES:${PN} += "u-boot-avnetultra96rev1-doc"

RDEPENDS:${PN} += ""

inherit rpm
