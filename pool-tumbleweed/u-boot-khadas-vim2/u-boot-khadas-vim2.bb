SUMMARY = "The U-Boot firmware for the khadas-vim2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the khadas-vim2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-khadas-vim2-2023.07-1.1.aarch64.rpm"
RPM_HASH = "3f2bb5eff65af2fe23e9e3718ee86ebe7adbf668c04fa55526ce365dfb1686736fed0baf87ce280ba91a3b0cb79259960b39aaf6bc68fc4c315bf1e882ece622"

RPROVIDES:${PN} += "u-boot-khadas-vim2 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
