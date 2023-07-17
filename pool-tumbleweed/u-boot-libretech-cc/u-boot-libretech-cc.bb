SUMMARY = "The U-Boot firmware for the libretech-cc platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the libretech-cc platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-libretech-cc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "5059f9643f18eb5d4ee82065fa410f4de9ed268636cb476653ada50fa34b82892d777505444c156e786fb00bbcf60d390301932cd1d2b7b2e5af53f95e468b3e"

RPROVIDES:${PN} += "u-boot-libretech-cc \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
