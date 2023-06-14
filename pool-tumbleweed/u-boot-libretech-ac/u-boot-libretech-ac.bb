SUMMARY = "The U-Boot firmware for the libretech-ac platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the libretech-ac platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-libretech-ac-2023.04-2.1.aarch64.rpm"
RPM_HASH = "d610b1717cf6da7be53c7c0e0a0334a1d2715d8d019aa20d378fe209b746418b6d9779524bcb96fd30018f9c349c45921f664fb8229b1eccf0459a749d026a15"

RPROVIDES:${PN} += "u-boot-libretech-ac \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
