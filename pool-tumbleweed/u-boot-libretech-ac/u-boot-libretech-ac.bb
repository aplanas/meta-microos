SUMMARY = "The U-Boot firmware for the libretech-ac platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the libretech-ac platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-libretech-ac-2023.07-1.1.aarch64.rpm"
RPM_HASH = "fa0157cf5d72f66c85ff28c4996b155432ca71b641a845c3b9221c02ba3051ea2530bedb24a37e74f21eea1d10eab9e9fbec3006922b6355676cb27b9f61d6f3"

RPROVIDES:${PN} += "u-boot-libretech-ac \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
