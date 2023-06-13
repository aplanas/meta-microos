SUMMARY = "The U-Boot firmware for the avnetultra96rev1 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the avnetultra96rev1 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-avnetultra96rev1-2023.04-2.1.aarch64.rpm"
RPM_HASH = "10fdc1ad473a2d003c7a5a9170e3af194b3a231de1f5392ce18a920a699e70016a745b8a73bfd6f9af1e6a7192d39d24c221ccf66e18c6c6aeeda0ce4b1977a1"

RPROVIDES:${PN} += "u-boot-avnetultra96rev1 \
u-boot-avnetultra96rev1(aarch-64) \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
