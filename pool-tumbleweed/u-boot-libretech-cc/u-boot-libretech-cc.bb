SUMMARY = "The U-Boot firmware for the libretech-cc platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the libretech-cc platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-libretech-cc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "60e29edb9f0d1a4e6107066e2005b73ca02e281da84324cfaa9cecd79bd34acf280a5cd5ae7cb9455c2dcd789efe957daf0e8190e71642befb78b25284c84c49"

RPROVIDES:${PN} += "u-boot-libretech-cc \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
